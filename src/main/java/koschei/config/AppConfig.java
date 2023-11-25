package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {


    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public Needle7 needle7() {
        Needle7 needle7 = new Needle7();
        needle7.setDeth8(deth()); // Внедрение зависимости через сеттер
        return needle7;
    }
    @Bean
    public  Deth8 deth() {
        return new  Deth8();
    }
}









