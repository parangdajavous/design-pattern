package ex06.notification;

// 책임: 알림 전송
public class SmsNotifier implements Notifier {

    private Notifier notifier;  // has

    // 기본 생성자
    public SmsNotifier() {
    }

    // 의존성 주입
    public SmsNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send() {
        System.out.println("문자 알림");
        if (notifier != null) notifier.send();
    }
}
