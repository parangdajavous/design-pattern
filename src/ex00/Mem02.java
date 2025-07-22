package ex00;


abstract class Car {
    abstract void run();
}

class Genesis extends Car {
    // 부모의 메서드를 같은 이름으로 재정의
    void run() {
        System.out.println("Genesis run");
    }
}

class Sonata extends Car {
    // 부모의 메서드를 같은 이름으로 재정의
    void run() {
        System.out.println("Sonata run");
    }
}

public class Mem02 {
    public static void main(String[] args) {
        Car car1 = new Sonata();
        car1.run();

        Car car2 = new Genesis();
        car2.run();


    }
}
