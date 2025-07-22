package ex03;

/*
 * 어뎁터를 만들땐 클래스명만 봐도 어뎁터인 것을 알 수 있게 해야함
 * */
public class TigerAdapter extends Animal {

    private OuterTiger outerTiger;

    // 의존성 주입
    public TigerAdapter(OuterTiger outerTiger) {
        this.outerTiger = outerTiger;
    }

    // 동일한 함수명으로 끼워 맞춘다
    public String getName() {
        return outerTiger.getFullName();
    }
}
