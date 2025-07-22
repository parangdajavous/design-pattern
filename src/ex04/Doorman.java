package ex04;

public class Doorman {

    // instance는 static 공간에 저장되고, Doorman의 Heap의 주소를 가진다
    public static Doorman instance = new Doorman();

    // 책임을 가진 메서드 - 객체를 생성하는 책임
    public static Doorman createInstance() {
        return new Doorman();
    }

    private Doorman() {
    }

    // 객체의 책임
    public void 쫓아내(Animal animal) {
        System.out.println(animal.getName() + " 나가!!");
    }
}
