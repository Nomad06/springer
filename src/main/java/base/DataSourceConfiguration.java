package base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.activation.DataSource;

@Configuration
public class DataSourceConfiguration {

    @Bean(destroyMethod = "shutdown")
    @Profile("dev")
    public DataSource embeddedDataSource(){
        return (DataSource) new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:schema.sql")
                .addScript("classpath:test-data.sql")
                .build();
    }

    @Bean
    @Profile("prod")
    public DataSource jndiDataSource(){
        JndiObjectFactoryBean factoryBean = new JndiObjectFactoryBean();
        factoryBean.setJndiName("jdbc/myDS");
        factoryBean.setResourceRef(true);
        factoryBean.setProxyInterface(javax.sql.DataSource.class);
        return (DataSource) factoryBean.getObject();
    }
}
