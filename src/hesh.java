import java.util.HashMap;
import java.util.HashSet;

public class hesh {

    public static void main(String[] args) {
        HashMap<String, Integer> weli = new HashMap<String, Integer>();

        // bejir
        weli.put("Weli Ganteng" , 900);
        weli.put("Weli ganteng banget", 920);
        weli.put("Weli Ganteng bagnet banget", 930);
        weli.put("Weli Ganteng banget banget banget", 940);

        for (String i : weli.keySet()) {
            System.out.println("key : " + i + " values : " + weli.get(i));
        }
    }
}
