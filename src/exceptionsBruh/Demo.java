package exceptionsBruh;

public class Demo {

    static void infinity(String test){  //example erroru (stack ovefrlow)
        System.out.println(test);
        infinity(test);
    }
    public static void main(String[] args) {
        try{
            infinity("pico");
        } catch (StackOverflowError err){
            err.printStackTrace();
            System.out.println("Ran out of memory");
        }

    }
}
