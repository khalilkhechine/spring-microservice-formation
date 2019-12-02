package tn.numeryx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import tn.numeryx.bean.Developer;
import tn.numeryx.bean.Enterprise;
import tn.numeryx.config.AppConfigWithAnnotation;
import tn.numeryx.config.AppConfigWithCoding;

public class Main {


    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfigWithAnnotation.class);
        Developer developer = (Developer) context.getBean("developer");
        Enterprise enterprise = (Enterprise) context.getBean("enterprise");
        System.out.println(developer);
        System.out.println(enterprise);
    }
}
