package tretak.exceptionsBruh;

public class Concur {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            } else {
                System.out.println(i);
            }
        }
    }
}
