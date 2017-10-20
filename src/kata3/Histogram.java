/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class Histogram<T> {
    private final Map <T,Integer> map=new HashMap<>();
    
    public int get(T key){
        return map.get(key);
    }
    
    public Set<T> keySet(){
        return map.keySet();
    }
    
    public void increment(T key){
        map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);           
    }
}
