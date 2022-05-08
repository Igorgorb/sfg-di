package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * @author igorg
 * Date 08.05.2022
 */
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton Bean!!!");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }
}
