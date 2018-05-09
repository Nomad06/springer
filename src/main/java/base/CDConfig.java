package base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {

    @Bean
    public CompactDisc cd(){
        return new SgtPeppers();
    }
}
