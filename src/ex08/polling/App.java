package ex08.polling;

public class App {
    public static void main(String[] args) {
        LotteMart lotteMart = new LotteMart();
        Customer1 customer1 = new Customer1();

        // 1. 마트는 입고 준비
        new Thread(() -> {
            lotteMart.received(); // 5초
        }).start();


        // 2. 입고 확인 (데몬)
        while (true) {
            try {
                Thread.sleep(100); // 잠시 쉴 틈 주기 - 다른 일 할 수 있게
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (lotteMart.getValue() != null) {  // request (polling <- 데몬으로 돌아서 계속 요청하니까 다른 요청을 받을 수가 없다
                customer1.update(lotteMart.getValue() + "이 들어왔습니다.");
                break;
            } else {
                System.out.println("상품이 아직 들어오지 않았습니다");
            }
        }

    }
}