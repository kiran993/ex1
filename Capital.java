import java.util.HashMap;
import java.util.Scanner;

public class Capital {
  public static void main(String[] args) {
    HashMap<String, String> stateCapitalMap = new HashMap<String, String>();
    stateCapitalMap.put("Andhra Pradesh", "Hyderabad");
    stateCapitalMap.put("Arunachal Pradesh", "Itanagar");
    stateCapitalMap.put("Assam", "Dispur");
    stateCapitalMap.put("Bihar", "Patna");
    stateCapitalMap.put("Chhattisgarh", "Raipur");
    stateCapitalMap.put("Goa", "Panaji");
    stateCapitalMap.put("Gujarat", "Gandhinagar");
    stateCapitalMap.put("Haryana", "Chandigarh");
    stateCapitalMap.put("Himachal Pradesh", "Shimla");
    stateCapitalMap.put("Jammu and Kashmir", "Srinagar");
    stateCapitalMap.put("Jharkhand", "Ranchi");
    stateCapitalMap.put("Karnataka", "Bengaluru");
    stateCapitalMap.put("Kerala", "Thiruvananthapuram");
    stateCapitalMap.put("Madhya Pradesh", "Bhopal");
    stateCapitalMap.put("Maharashtra", "Mumbai");
    stateCapitalMap.put("Manipur", "Imphal");
    stateCapitalMap.put("Meghalaya", "Shillong");
    stateCapitalMap.put("Mizoram", "Aizawl");
    stateCapitalMap.put("Nagaland", "Kohima");
    stateCapitalMap.put("Odisha", "Bhubaneswar");
    stateCapitalMap.put("Punjab", "Chandigarh");
    stateCapitalMap.put("Rajasthan", "Jaipur");
    stateCapitalMap.put("Sikkim", "Gangtok");
    stateCapitalMap.put("Tamil Nadu", "Chennai");
    stateCapitalMap.put("Telangana", "Hyderabad");
    stateCapitalMap.put("Tripura", "Agartala");
    stateCapitalMap.put("Uttar Pradesh", "Lucknow");
    stateCapitalMap.put("Uttarakhand", "Dehradun");
    stateCapitalMap.put("West Bengal", "Kolkata");
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the name of an Indian state: ");
    String stateName = input.nextLine();
    String capitalName = stateCapitalMap.get(stateName);
    if (capitalName != null) {
      System.out.println("The capital of " + stateName + " is " + capitalName + ".");
    } else {
      System.out.println("Sorry, we don't have the capital of " + stateName + " in our database.");
    }
  }
}
