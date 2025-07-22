package ex98;

// Mock 객체 - 가짜
public class EmailAdapter implements Email {
    public int send(String to, String from, String msg) {
        System.out.println("진짜 이메일 전송됨");
        return 1;
    }
}
