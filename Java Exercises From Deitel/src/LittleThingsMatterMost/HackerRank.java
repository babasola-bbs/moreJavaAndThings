package LittleThingsMatterMost;

import java.util.Arrays;
import java.util.List;

public class HackerRank {
    
    public static void main(String[] args) {

        String sentence ="this is crazy and fun";
        String[] name = {"is", "fun"};
        int count = 0;
        String[] splitted = sentence.split(" ");
        String capitalize = "";

        for(int i = 0; i < name.length; i++){
            for(int j = 0; j < splitted.length; j++){
                if(name[i].equals(splitted[j])){
                    splitted[j] = "";
                }
            }
        }
        for(int k = 0; k < splitted.length; k++){
            if(splitted[k] == "") continue;
            capitalize = splitted[k].substring(0, 1).toUpperCase() + splitted[k].substring(1);
            System.out.print(capitalize+" ");
        }
    }
}
