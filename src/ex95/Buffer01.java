package ex95;

import java.io.IOException;
import java.io.InputStream;

public class Buffer01 {
    public static void main(String[] args) {
        // 키보드로부터 받는 값 입력

        InputStream in = System.in;

        try {
            int r = in.read();
            System.out.println(r);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
