package LittleThingsMatterMost;

import java.util.ArrayList;

public class CustomStack {
    int defaultMinimum;

    static class Pair{
        int minimum;
        int element;

        public Pair(int minimum, int element){
            this.minimum = minimum;
            this.element = element;
        }
    }

    public CustomStack(){
        this.defaultMinimum = Integer.MAX_VALUE;
    }

    ArrayList<Pair> customStack = new ArrayList();

    void addElement(int element){
        if (element < defaultMinimum || customStack.size() == 0) defaultMinimum = element;
        Pair newElement = new Pair(defaultMinimum, element);
        customStack.add(newElement);
        System.out.println(element + " Inserted Successfully");
    }

    int getLastElement(){
        if (customStack.size() == 0){
            System.out.println("UnderFlow Error");
            return -1;
        }
        else{
            return customStack.get(customStack.size() - 1).element;

        }
    }

    void removeLastElement(){
        if (customStack.size() == 0){
            System.out.println("UnderFlow Error");
        }
        else if (customStack.size() > 1){
            defaultMinimum = customStack.get(customStack.size() - 2).minimum;
        }
        else{
            defaultMinimum = Integer.MAX_VALUE;
        }
        int previousLast = customStack.get(customStack.size() -1).element;
        customStack.remove(customStack.size() -1);
        System.out.println("Successfully Removed "+ previousLast);
    }

    int getDefaultMinimum(){
        if (customStack.size() == 0){
            System.out.println("UnderFlow Error");
            return -1;
        }
        else{
            return customStack.get(customStack.size() - 1).minimum;
        }
    }

    public static void main(String[] args) {
        CustomStack customStack = new CustomStack();
        customStack.addElement(7);
        customStack.addElement(64);
        customStack.addElement(34);
        System.out.println("Minimum Element Is " + customStack.getDefaultMinimum());
        customStack.removeLastElement();
        customStack.addElement(30);
        customStack.addElement(28);
        System.out.println("Last Element Is " + customStack.getLastElement());

    }
}
