
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:propers.properties")
public class ProperConfig {

    @Autowired
    Environment env;

    @Bean
    public MrProper mrProperHair(@Value("#{systemProperties['mrProper.hair']}") Boolean isBold){
        return new MrProperHair(isBold);
    }

    @Bean
    public MrProper mrProperBold(@Value("#{systemProperties['mrProper.bold']}") Boolean isBold){
        return new MrProperBold(isBold);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
