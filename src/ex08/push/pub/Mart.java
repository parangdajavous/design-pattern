package ex08.push.pub;

import ex08.push.sub.Customer;

// Publisher - 출판과 구독의 책임이 있음 (고객은 구독 메서드를 호출)
public interface Mart {
    // 1. 구독
    void add(Customer customer); // 구독한 고객을 컬렉션에 저장

    // 2. 구독 취소
    void remove(Customer customer); // 구독한 고객을 컬렉션에서 삭제

    // 3. 출판
    void receive();

    // 4. 알림
    void notify(String msg);
}
