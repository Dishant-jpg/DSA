import java.util.*;
public class string_ls{
    public static int linear(String menu[], String key ){
        for(int i=0; i<menu.length; i++){
            if(menu[i] == key){
                return i ;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String menu[] = {"samosa", "sandwish", "kachori", "poha", "coffee", "tea", "idli", "pizza", "burger", "panner samosa"};
        String key = "poha";
        int index = linear(menu, key);
        if(index == -1){
            System.out.print("Not found");
        }else{
            System.out.print("menu is :" + index);
        }

    }
   
}
