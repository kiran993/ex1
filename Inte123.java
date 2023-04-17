import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inte123 {
    public static void main(String[] args) {
        
        List<Integer> In1 = Arrays.asList(1,2,5,8,7,4);
        List<Integer> In2 = new ArrayList<Integer>();

        for(int a: In1) {
            if(a % 2 == 0) {
                In2.add(a);
            }
        }

        System.out.println(In2);
        In2.sort(null);
        System.out.println(In2);
    }
}