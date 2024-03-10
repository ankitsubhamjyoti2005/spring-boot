//Java Data Structures 101: Conquer Arrays, Maps, Interfaces & Optionals 💪
import java.util.*;

public class Data_Structures {
   public static void main(String[] args) {
        List<Integer> ARR = new ArrayList<>();
        Map<String,Integer> mp = new HashMap();

        mp.put("ankit subhamjyotoi", 1000000000);
        mp.put("test", 234);
        mp.put("test2", 9987);


        for(Map.Entry<String,Integer> entry:mp.entrySet()){
            System.out.print(entry.getKey()+"----->");
            System.out.println(entry.getValue());

        }
   } 
}
