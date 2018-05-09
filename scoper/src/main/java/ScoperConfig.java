import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

@Configuration
public class ScoperConfig {
    @Bean
    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.INTERFACES)
    public Scoper sessionScoper(){
        return new SessionScoper();
    }

    @Bean
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.INTERFACES)
    public Scoper requestScoper(){
        return new RequestScoper();
    }

    @Bean
    public Scoper singletonScoper(){
        return new SingletonScoper();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Scoper prototypeScoper(){
        return new PrototypeScoper();
    }

    @Bean
    public ScoperOwner scoperOwner(Scoper singletonScoper, Scoper prototypeScoper){
        return new ScoperOwner(singletonScoper, prototypeScoper);
    }
}
