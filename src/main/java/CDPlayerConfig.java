package base;

import Annotations.CustomAnn;
import magic.MagicBean;
import magic.MagicBeanCondition;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
    @Bean
    public CDPlayer cdPlayer(CompactDisc sgtPeppers){
        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.setCd(sgtPeppers);
        return cdPlayer;
    }

    @Bean
    @CustomAnn
    @Qualifier("peppa")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    @Conditional(MagicBeanCondition.class)
    public MagicBean magicBean(){
        return new MagicBean();
    }

    @Bean
    @Qualifier("beat")
    public CompactDisc randomBeatlesCD(){
        int choice = (int) Math.floor(Math.random() * 4);
        if(choice == 0){
            return new SgtPeppers();
        }
        else if(choice == 1){
            return new WhiteAlbum();
        }
        else if(choice == 2){
            return new HardDaysNight();
        }
        else {
            return new Revolver();
        }
    }
}
