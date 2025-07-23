package ex06.notification;

public class EmailNotifier implements Notifier {

    private Notifier notifier;  // has


    // 기본 생성자
    public EmailNotifier() {
    }


    // 의존성 주입
    public EmailNotifier(Notifier notifier) {
        this.notifier = notifier;
    }


    public void send() {
        System.out.println("이메일 알림");
        if (notifier != null) notifier.send(); // 의존하는 게 있으면 실행
    }
}
