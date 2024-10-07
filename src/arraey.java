import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraey {
    public static void main(String[] args) {
        ArrayList<Integer> weli= new ArrayList<Integer>();
        weli.add(100);
        weli.add(200);
        weli.add(10);
        weli.add(500);
        Collections.sort(weli);
       for (int i : weli) {
           System.out.println((i));
       }
    }
}
