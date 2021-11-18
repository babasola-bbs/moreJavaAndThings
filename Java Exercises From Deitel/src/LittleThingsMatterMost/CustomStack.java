package LittleThingsMatterMost;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

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


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CustomStack customStack = new CustomStack();
        customStack.addElement(7);
        customStack.addElement(64);
        customStack.addElement(34);
        System.out.println("Minimum Element Is " + customStack.getDefaultMinimum());
        customStack.removeLastElement();
        customStack.addElement(30);
        customStack.addElement(28);
        System.out.println("Last Element Is " + customStack.getLastElement());








        // ITERATOR & LISTITERATOR WITH ARRAYLIST

        ArrayList<String> fruits = new ArrayList();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Pineapple");
        Iterator iterator = fruits.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Collections.sort(fruits);
        ListIterator<String> fruitsList = fruits.listIterator(fruits.size());
        while(fruitsList.hasPrevious()){
            System.out.println(fruitsList.previous());
        }

        //  LAMBDA FOR-EACH

        fruits.set(2,"Peaches");
        fruits.forEach(fruit -> System.out.println(fruit));
        iterator.forEachRemaining(fruitIterator -> System.out.println(fruitIterator));

        //  SERIALIZATION

        FileOutputStream outputStream = new FileOutputStream("fileStream.txt");
        ObjectOutputStream objectOutput = new ObjectOutputStream(outputStream);
        objectOutput.writeObject(fruits);
        outputStream.close();
        objectOutput.close();

        //  DESERIALIZATION
        FileInputStream fileInputStream = new FileInputStream("fileStream.txt");
        ObjectInputStream objectInput = new ObjectInputStream(fileInputStream);
        ArrayList readFruits = (ArrayList) objectInput.readObject();
        System.out.println("Read :" + readFruits + "From File");

        // RETAINALL (IS LIKE INTERSECTION)

        ArrayList moreFruits = new ArrayList();
        moreFruits.add("Orange");
        moreFruits.add("Tangerine");
        moreFruits.add("Mango");
        moreFruits.add("Pear");
//        fruits.addAll(2, moreFruits);
//        fruits.removeIf(str -> str.contains("Apple"));
        fruits.retainAll(moreFruits);
        Iterator retainIterator = fruits.iterator();
        while (retainIterator.hasNext()){
            System.out.println(retainIterator.next() + " Is Their Intersect");
        }
    }
}
