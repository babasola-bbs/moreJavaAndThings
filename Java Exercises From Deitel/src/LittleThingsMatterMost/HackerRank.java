package LittleThingsMatterMost;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRank {

    public static void main(String[] args) {


//                              **** USING SPLIT ****
//        String sentence ="this is crazy and fun";
//        String[] name = {"is", "fun"};
//        int count = 0;
//        String[] splitted = sentence.split(" ");
//        String capitalize = "";
//
//        for(int i = 0; i < name.length; i++){
//            for(int j = 0; j < splitted.length; j++){
//                if(name[i].equals(splitted[j])){
//                    splitted[j] = "";
//                }
//            }
//        }
//        for(int k = 0; k < splitted.length; k++){
//            if(splitted[k] == "") continue;
//            capitalize = splitted[k].substring(0, 1).toUpperCase() + splitted[k].substring(1);
//            System.out.print(capitalize+" ");
//        }


//                              **** USING PATTERN/REGEX ****
//        int count = 0;
//        String phrase ="this is crazy and fun";
//        String[] words = {"it", "is", "this", "your", "crazy", "i", "am", "fun", "without", "you"};
//
//        HashSet hashSet = new HashSet();
//        for (String word:words) {
//            hashSet.add(word);
//        }
//
//        Pattern expression = Pattern.compile("[a-zA-Z]+");
//        Matcher match = expression.matcher(phrase);
//        while (match.find()){
//                if (hashSet.contains(match.group())) count++;
//        }
//        System.out.println("Just " +count+ " Matching Word(s) Found");


//                              **** USING TOKENIZER ****
//        String str = "One two       three\n four\tfive ";
//        StringTokenizer stringTokenizer = new StringTokenizer(str);
//        System.out.println(stringTokenizer.countTokens());
    }
}
