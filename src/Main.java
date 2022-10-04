public class Main {
    public static void main(String[] args) {
        /*
        char myChar = 'D';
        char unicode = '\u00C0';
        //System.out.println("unicode = " + unicode);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean IsCustomerOverTwentyOne = true;


        String myString = "This is a string";
        //System.out.println("myString = " + myString);
        myString = myString + ", and this more";
        //System.out.println("myString = " + myString);
        myString = myString + "\u00A9 2022";
        //System.out.println("myString = " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.5";
        //System.out.println("numberString = " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        //System.out.println("lastString = " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        //System.out.println("lastString = " + lastString);

        //operators

        int result = 1 + 2;
        //System.out.println("1 + 2  = " + result);
        int previousResult = result;
        //System.out.println("previousResult = " + previousResult);
        result = result - 1;
        //System.out.println("3 - 1 = " + result);

        result = result * 10;
        //System.out.println("2 * 10 = " + result);

        result = result / 5;
        //System.out.println("20 / 5 = " + result);

        result = result % 3;
        //System.out.println("4 % 3 = " + result);

        // if-Then statement
        boolean isAlien = false;
        if (isAlien) {
//            System.out.println(" IS not a alien");
            //           System.out.println("Es un alien");
        }
*/
        int topScore = 100;
        if (topScore != 100) {
            System.out.println(" you got the high score");
        }

        int secondTopScore = 80;
        if (topScore > secondTopScore || topScore < 11) {
            //System.out.println("Greater than second top score and less than 100");
        } else {
            //System.out.println("ninguna");
        }

        //challenge

        double doubleValue = 20.00d;
        double doubleValue2 = 80.00d;
        double multiply = (doubleValue2 + doubleValue) * 100.00d;
        double reminder = (int) 40.00d % multiply;

        boolean booleanValue = (reminder == 0) ? true : false;
        System.out.println("booleanValue = " + booleanValue);
        if (booleanValue != true) {
            System.out.println("Got some reminder");
        }

    }
}