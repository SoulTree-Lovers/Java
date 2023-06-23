public class MathBeanTest {
    public static void main(String[] args){ // static으로 선언하면 자동으로 메모리에 올라간다.
        MathBean math = new MathBean(); // heap 메모리에 올라간다.

        math.printClassName();
        math.printNumber(100);
        System.out.println(math.getOne());
        System.out.println(math.plus(10, 20));

    }


}
