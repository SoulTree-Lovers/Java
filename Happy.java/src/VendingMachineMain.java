// 인스턴스를 만드는 3가지 방법
// 1. new 연산자와 생성자 이용
// 2. 클래스 로더를 이용
// 3. 메모리에 있는 인스턴스를 복제

public class VendingMachineMain {
    public static void main(String[] args){
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(100);
        System.out.println(product);

        VendingMachine.printVersion(); // static method는 인스턴스를 생성하지 않아도 사용 가능하다.
        vm1.printVersion(); // 인스턴스에서도 사용이 가능하다! (바람직한 방법은 아니다)
    }
}
