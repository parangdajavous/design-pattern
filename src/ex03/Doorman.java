package ex03;

public class Doorman {
    // 객체의 책임
    // 하나의 책임만 줄 수 있으면 좋겠지만 그럴 수 없다면 하나로 묶는다
    public void 쫓아내(Animal animal) {
        System.out.println(animal.getName() + " 나가!!");
    }
}
