public class Main {
    public static void main(String[] args) {
        char myChar = 'D';
        char unicode = '\u00C0';
        //System.out.println("unicode = " + unicode);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean IsCustomerOverTwentyOne = true;


        String myString = "This is a string";
        System.out.println("myString = " + myString);
        myString = myString + ", and this more";
        System.out.println("myString = " + myString);
        myString = myString + "\u00A9 2022";
        System.out.println("myString = " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.5";
        System.out.println("numberString = " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString = " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString = " + lastString);
    }
}