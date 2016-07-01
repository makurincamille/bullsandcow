package lv.ctco.javaschool.bullsandcows;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 *
 */
@Named("hello")
@RequestScoped
public class HelloBean implements Serializable{
    private String name;
    //Bean injection
    @Inject
    private NameCounterBean counter;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNamesCount(){
        return counter.getCount();
    }

    public String action(){
        counter.register(name);
        return "hello";
    }
}
