package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Numbers {

    public static double minimum3(double floating1, double floating2, double floating3){
        return Math.min(floating1, Math.min(floating2, floating3));
    }

    public static void isPerfect(int number){
        int checkingPerfect = 0;
        String verdict = "Is Not A Perfect Number";
        String takingFactors = "The Factors Of "+number+" Are ";
        for(int i = 1; i <= 10000; i++){
            if (number%i == 0){
                takingFactors = new StringBuilder().append(takingFactors).append(i+" ").toString();
                checkingPerfect += i;
                if (checkingPerfect == number){
                    verdict = "Is A Perfect Number";
                    break;
                }
                else if (i == number) break;
            }

        }
        System.out.println(takingFactors);
        System.out.println(number+" "+verdict);
    }

    public static boolean isPrime(int given) {
        boolean checkPrime = true;
        for (int i = 2; i < given; i++) {
            if (given % i == 0) checkPrime = false;
        }
        return checkPrime;
    }

    public static void displayAllPrime(int limit){
        String container = "";
        for (int i = 2; i < limit; i++){
            if(isPrime(i)) container = new StringBuilder().append(container).append(i+" ").toString();
        }
        System.out.print(container);
    }

    public static int divideBy(int a){
        return a/10;
    }

    public static int remainsBy(int b){
        return b%10;
    }

    public static String reverseDigits(int yourDigits){
        String holdOurReverse = "";

        while(yourDigits > 0){
            int answer2 = remainsBy(yourDigits);
            holdOurReverse = new StringBuilder().append(holdOurReverse).append(answer2).toString();
            yourDigits = divideBy(yourDigits);
        }
        return  holdOurReverse;
    }

    public static int gcd(int numeroUno, int numeroDeux){

        int hcf = 1;
        int numberCruise = 2;
        while(numberCruise <= numeroUno && numberCruise <= numeroDeux){
            if (numeroUno % numberCruise == 0 && numeroDeux % numberCruise == 0)
                hcf = numberCruise; numberCruise++;
        }
        return hcf;
    }

    public static int qualityPoint (int studentAverage){
        int grade = 0;
                if(studentAverage >= 90) grade = 4;
                else if (studentAverage >= 80) grade = 3;
                else if (studentAverage >= 70) grade = 2;
                else if (studentAverage >= 60) grade = 1;
        return grade;
    }

    public enum Coin{
        HEAD, TAIL;
    }

    public static Coin flip() {
        Coin coinFace;
        int headCount = 0;
        int tailCount = 0;
        SecureRandom randomize = new SecureRandom();
        if (randomize.nextInt(2) == 0) {
            coinFace = Coin.HEAD;
        }
        else {coinFace = Coin.TAIL;}
        return coinFace;
    }
    public static String tossCount(){

        flip();
        Coin coinFace = null;
        String afterToss = "";
        int headCount = 0;
        int tailCount = 0;
        SecureRandom randomize = new SecureRandom();
        if(flip() == Coin.HEAD){
            headCount++;
            afterToss = "You Tossed A "+coinFace+" \nYou Have Tossed "+coinFace+" "+headCount+" Times";
        }
        else {coinFace = Coin.TAIL;
        tailCount++;
            afterToss = "You Tossed A "+coinFace+" \nYou Have Tossed "+coinFace+" "+tailCount+" Times";
        }
        return afterToss;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 3 Numbers, To Determine The Minimum");
//        double firstNumber = scanner.nextInt();
//        double secondNumber = scanner.nextInt();
//        double thirdNumber = scanner.nextInt();
//        System.out.println(minimum3(firstNumber, secondNumber, thirdNumber));
//
//        System.out.println("Enter A Number To Know If It Is A Perfect Number");
//        int enteredNumber = scanner.nextInt();
////        isPerfect(enteredNumber);
//
//        System.out.println("Enter A Number To Know If It Is A Prime Number");
//        int enteredNumber = scanner.nextInt();
//        displayAllPrime(enteredNumber);
//
//        System.out.println("Enter A Number To Know If It Is A Prime Number");
//        int enteredNumber = scanner.nextInt();
//
//        System.out.println(reverseDigits(1234));
//
//        System.out.println(gcd(48,18));
//
//        System.out.println(qualityPoint(95));

        int userSelection;
        System.out.println("Select 1 To Toss The Coin");
        System.out.println("Select 2 To See Toss Count");
        while((userSelection = scanner.nextInt()) == 1){
            System.out.println("Select 1 To Toss The Coin");
            System.out.println("Select 2 To See Toss Count");
        }

        switch (userSelection){
            case 1 :
                flip();
            case 2 :
                tossCount();
        }

        System.out.println(flip());

    }
}
