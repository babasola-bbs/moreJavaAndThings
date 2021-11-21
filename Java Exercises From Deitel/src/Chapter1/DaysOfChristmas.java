package Chapter1;

public class DaysOfChristmas {


    public static void main(String[] args) {


        for (int day = 1; day <= 12; day++) {
            System.out.print("On The " + day);

            switch (day) {
                case 1 -> System.out.print("st ");
                case 2 -> System.out.print("nd ");
                case 3 -> System.out.print("rd ");
                default -> System.out.print("th ");
            }
            System.out.println("Day Of Christmas My True Love Said To Me");

            switch (day) {
                case 12:
                    System.out.println("Twelve Drummers Drumming,");
                case 11:
                    System.out.println("Eleven Pipers Piping,");
                case 10:
                    System.out.println("Ten Lords A-Leaping,");
                case 9:
                    System.out.println("Nine Ladies Dancing,");
                case 8:
                    System.out.println("Eight Maids A-milking,");
                case 7:
                    System.out.println("Seven Swans A-Swimming,");
                case 6:
                    System.out.println("Six Geese A-laying,");
                case 5:
                    System.out.println("Five Gold Rings,");
                case 4:
                    System.out.println("Four Calling Birds,");
                case 3:
                    System.out.println("Three French Hens,");
                case 2:
                    System.out.println("Two Turtle Doves,");
                case 1:
                    System.out.println("A Partridge In A Pear Tree.\n");
                    break;
            }
        }
    }

}
