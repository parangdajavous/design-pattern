package ex02;

/*
 * DoormanProxy의 역할
 * "안녕" 인사 후 동물을 쫒아낸다 - 새로운 코드 확장
 * Doorman이 "안녕" 인사하는 건 OCP 위배
 * */

// extends에 문제는 없으나 의미상 안맞음
public class DoormanProxy {
    private Doorman doorman;  // has

    // 의존성 주입
    public DoormanProxy(Doorman doorman) {
        this.doorman = doorman;
    }

    public void 쫓아내(Animal animal) {
        System.out.println("안녕");
        doorman.쫓아내(animal);
    }
}
