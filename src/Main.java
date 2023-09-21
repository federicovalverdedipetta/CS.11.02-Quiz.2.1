public class Main {

    public static void main(String[] args) {
        int numOne = (2);
                int numTwo = (9);
                        String name = "valverde";
                                int numThree = (62);
                                        int numFour = (1);
                                                String toBePrinted = "i love dogs";
                                                int resultOne = add (numOne,numTwo);
                                                System.out.println(resultOne);
                                                String resultTwo = greeting(name);
                                                System.out.println(resultTwo);
                                                int resultThree = add(numOne,numTwo,numThree,numFour);
                                                System.out.println(resultThree);
                                                String print = printMe (toBePrinted);
                                                System.out.println(print);
    }
    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }
    public static String greeting(String name){
        return "bonjour, " + name;
    }
    public static int add(int numOne, int numTwo, int numThree, int numFour){
        int first = add(numOne, numTwo);
        int second = add(numThree, numFour);
        return first + second;
    }
    public static String printMe(String toBePrinted){
        return toBePrinted;
    }
}