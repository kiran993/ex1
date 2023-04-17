import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PK {
    
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<String>();
        inputList.add("apple");
        inputList.add("banana");
        inputList.add("apple");
        inputList.add("cherry");
        inputList.add("banana");
        
        List<String> uniqueList = getUniqueList(inputList);
        System.out.println(uniqueList); // Output: [apple, banana, cherry]
    }
    
    public static List<String> getUniqueList(List<String> inputList) {
        Set<String> uniqueSet = new HashSet<String>(inputList);
        List<String> uniqueList = new ArrayList<String>(uniqueSet);
        Collections.sort(uniqueList);
        return uniqueList;
    }
}
