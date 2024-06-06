package ArrayList;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();

        //food.add("pizza");
        //food.add("Cakes");
        food.add("meat");
        food.addAll(food);
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
