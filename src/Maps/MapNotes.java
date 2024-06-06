package Maps;

import java.util.HashMap;


public class MapNotes {
        public static void main(String[] args) {
            // Creating a HashMap
            HashMap<String, Integer> scores = new HashMap<>();

            // Adding key-value pairs
            scores.put("Alice", 95);
            scores.put("Bob", 85);
            scores.put("Charlie", 90);

            // Accessing values
            System.out.println("Bob's score: " + scores.get("Bob"));

            // Iterating over keys
            for (String name : scores.keySet()) {
                System.out.println(name + "'s score: " + scores.get(name));
            }

            // Checking if a key exists
            String key = "Alice";
            if (scores.containsKey(key)) {
                System.out.println(key + "'s score: " + scores.get(key));
            }

            // Removing a key-value pair
            scores.remove("Charlie");
            System.out.println("After removing Charlie's score: " + scores);
        }
    }
// HashMap is a class that implements map interface
