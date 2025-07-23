package ex08.push.pub;

import ex08.push.sub.Customer;

import java.util.ArrayList;
import java.util.List;

// 구현할 때는 각 메서드의 책임을 알아야 한다
public class EMart implements Mart {

    // 구독자 명단
    private List<Customer> customerList = new ArrayList<Customer>();


    // 구독 등록
    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    // 구독 취소
    @Override
    public void remove(Customer customer) {
        customerList.remove(customer);
    }

    // 출판
    @Override
    public void receive() {
        for (int i = 0; i < 5; i++) {
            System.out.println(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        notify("EMart : 딸기");  // 출판 완료 후 고객에게 알림  <- callback 후 push
    }

    // 알림
    @Override
    public void notify(String msg) {
        for (Customer customer : customerList) {
            customer.update(msg);
        }
    }
}
