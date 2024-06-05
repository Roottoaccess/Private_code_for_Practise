import java.util.HashMap;
// import java.util.function.BiFunction;
public class Hash_map {
    public static void main(String[] args) {
        
        /* Declaring the HashMap */
        HashMap<String, Integer> empID = new HashMap<>();

        /* Pushing the value in the Hash Map */
        empID.put("Biswarup", 983011);
        empID.put("Jeet",9836);
        empID.put("Aishwarya",70031203);
        empID.put("Jerry",154420);

        System.out.println();
        /* Printing the value */
        System.out.println(empID);

        /* Fetching the value */
        System.out.println("The value of jeet is: "+empID.get("Jeet"));

        /* Replace the value */
        empID.replace("Aishwarya", 2481214);
        System.out.println();
        System.out.println(empID);

        /* is present */
        empID.putIfAbsent("Krishna", 142200);
        System.out.println();
        System.out.println(empID);

        empID.putIfAbsent("Hacker", 777);
        System.out.println();
        System.out.println(empID);

        /* Remove operation in Hashmap */
        empID.remove("Hacker");
        System.out.println();
        System.out.println(empID);

        /* CREATING ANOTHER HASHMAP */
        HashMap <String, Integer> empAcc = new HashMap<>();

        empAcc.put("Biswarup",900000);
        empAcc.put("Jeet",1000000);
        empAcc.put("Aishwarya", 1500000);
        empAcc.put("Jerry",500000);

        System.out.println();
        System.out.println(empAcc);

    }
}
