import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class List123 {

   /**
    * @param args
    */
   public static void main(String[] args) {

 List<String> list = new ArrayList<String>();
 final List<String> list2 = new ArrayList<String>();

      list.add("Banana");
      list.add("Apple");
      list.add("peach");
      list.add("Mango");
      list.add("Banana");
      list.add("peach");

      for (String x : list) {

         if (!list2.contains(x)) {
            list2.add(x);
         }

      }
list2.sort(null);
      System.out.println(list2);
      list2.remove(0);
      
      System.out.println(list2);

   }
}
