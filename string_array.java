import java.util.*;


public class string_array {
    public static int lunch (String food[], String key){
            for(int i=0; i<food.length; i++){
                if(food[i] == key){
                    return i;
                }
            }
            return -1;
    }
    public static void main(String[] args) {
        String food [] = {"Burger", "Chowmein", "Dosa", "aloo dosa", "manchurian", "hakanudal", "idli", "pasta", "coffee", "cold coffee", "hot coffee", "choclate shake", "pizza", "onion pizza", "patties", "cheese patties"};

        String key = "pizza";

        int index = lunch(food, key);

        if(index == -1){
            System.out.println("Your food is not available");
        }
        else{
            System.out.println("Your food is available at Counter No." + index);
        }

    }
}
