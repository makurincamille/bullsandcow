package lv.ctco.javaschool.bullsandcows;

/**
 * Created by kamil.makurin on 6/30/2016.
 * tyuytu
 */

import javax.enterprise.context.ApplicationScoped;
import java.util.HashSet;
import java.util.Set;

@ApplicationScoped
public class NameCounterBean {
    private final Set<String> names = new HashSet<>();

    public synchronized int getCount (){
        return names.size();
    }

    public synchronized void register(String name){
        names.add(name.toLowerCase());
    }
}
