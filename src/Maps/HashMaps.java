package Maps;
// one of the two types of maps interfaces imports are used
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> EmployeeId = new HashMap<String, Integer>();

        EmployeeId.put("Jane", 20204989);
        EmployeeId.put("Joe", 30908765);
        EmployeeId.put("Eli",50908076);
        EmployeeId.put("Keli", 30908743);
        EmployeeId.put("Jane", 37912989);

       //System.out.println(EmployeeId);

        //System.out.println(EmployeeId.get("Joe"));
        //System.out.println(EmployeeId.containsKey("Keli"));
        System.out.println(EmployeeId.remove("Joe", 30908765));
       }


}
