package tn.numeryx.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tn.numeryx.bean.Developer;
import tn.numeryx.bean.Enterprise;

@Configuration
public class AppConfigWithCoding {

    @Bean
    public Developer developer() {
        Developer developer = new Developer();
        developer.setFirstName("Khalil");
        developer.setLastName("Khechine");
        return developer;
    }

    @Bean //@Bean(name = "beanName", initMethod = "methodToExecute", destroyMethod = "methodToExecute")
    public Enterprise enterprise() {
        Enterprise enterprise = new Enterprise();
        enterprise.setName("Numeryx");
        enterprise.setDeveloper(developer());
        return enterprise;
    }

}
