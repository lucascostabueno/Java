public class Main {
    public static void main(String[] args) {
        // boxing e unboxing
        int x = 20;

        Object obj = x;

        System.out.println(obj);

        int y = (int) obj;

        System.out.println(y);

        // wrapper class
        int a = 20;

        Integer obj2 = a;

        System.out.println(obj2);

        int b = obj2 * 2;

        System.out.println(b);
    }
}