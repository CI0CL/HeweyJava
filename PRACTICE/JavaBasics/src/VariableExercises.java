import java.util.*;

public class VariableExercises {
    int age = 10;
    double price = 4.99;
    String name = "John Smith";
    boolean isAvailable = true;
    int[] numbers = {1,2,3,4,5};
    int dayOfWeek = 1;

    public int myFirstMethod(){


        System.out.println(age);
        System.out.println(price);
        System.out.println(name);
        System.out.println(isAvailable);
        System.out.println(Arrays.toString(numbers));
        return age;
    }

    public void mySecondMethod() {
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Please enter your age: ");
        //int userInput = Integer.parseInt(scanner.nextLine());


        if (age < 18) {
            System.out.println("You're not allowed to vote!");
        } else if (age >= 18) {
            System.out.println("You're allowed to vote!");
        }
    }

    public void myThirdMethod(){

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend!");
        }
    }

    static void myFourthMethod(){
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

    static void myFifthMethod(){
        int i = 0;
        while(i <= 100){
            System.out.println(i);
            i+=2;

        }
    }

    static void mySixthMethod(){
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.print("Please enter a number between 1 and 10: ");
            userInput = Integer.parseInt(scanner.nextLine());
            System.out.println("You've entered number: "+ userInput);

        } while (userInput > 10 || userInput < 1 );

    }

    static String mySeventhMethod(int a, int b){
        int sumResult = a+b;
        System.out.println("Your sum is: " + a + " + " + b );
        String showResult = "And the answer is: " + sumResult;
        return showResult;

    }

    public void myEighthMethod(String newName) {
        System.out.println("Your name is: " + name);

        int count = 0;
        int nameLength = name.length();

        for (int i = 0; i < nameLength; i++) {
            char n = name.charAt(i);
            if (n == ' '){
                count++;
            }
        }
        System.out.println("That name is " + (nameLength-count) + " letters long.");
    }

    static void myNinthMethod(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            int num = array[i];
            sum += num;
        }
        System.out.println(sum);
    }

    public static void main(String[] age){
        VariableExercises myFirst = new VariableExercises();
        VariableExercises mySecond = new VariableExercises();
        VariableExercises myThird = new VariableExercises();
        myFirst.myFirstMethod();
        mySecond.mySecondMethod();
        myThird.myThirdMethod();
        myFourthMethod();
        myFifthMethod();
        mySixthMethod();
        String SeventhResult = mySeventhMethod(3,5);
        System.out.println(SeventhResult);

        VariableExercises myEighth = new VariableExercises();
        myEighth.myEighthMethod(myFirst.name);

        myNinthMethod(myFirst.numbers);
    }
}
