package tn.numeryx.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Enterprise {

    private String name;

    @Autowired
    private Developer developer;
    private Developer developerChief;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public Developer getDeveloperChief() {
        return developerChief;
    }

    public void setDeveloperChief(Developer developerChief) {
        this.developerChief = developerChief;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "name='" + name + '\'' +
                ", developer=" + developer +
                ", developerChief=" + developerChief +
                '}';
    }
}
