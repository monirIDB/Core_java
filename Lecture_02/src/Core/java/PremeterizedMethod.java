package Core.java;

public class PremeterizedMethod {

    public static void main(String[] args) {
        int a = 11;
        int b = 6;
//      PremeterizedMethod pm=new PremeterizedMethod();
//      int c = pm.preMethod(a, b);
        int c = preMethod(a, b);
        System.out.println("Minimum Value = " + c);
    }

    /**
     * returns the minimum of two numbers
     */
    public static int preMethod(int n1, int n2) {
        int min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;

    }
}
