package ex97;

// 인터페이스는
interface 나이프 {
    void 킬();

    void 요리();
}

// adapter
// interface 내부의 메서드를 걸러내는 용도로도 만들 수 있다
// 구현할 메서드를 제외하고 override 하면, 해당 adapter를 상속했을 때 구현할 메서드만 재정의하면 됨
abstract class 전투칼 implements 나이프 {
    @Override
    public void 요리() {

    }
}

abstract class 요리칼 implements 나이프 {
    @Override
    public void 킬() {

    }
}


class 덱스 extends 전투칼 {

    @Override
    public void 킬() {

    }
}

class 백종원 extends 요리칼 {
    @Override
    public void 요리() {
        
    }
}

public class App {
    public static void main(String[] args) {

    }
}