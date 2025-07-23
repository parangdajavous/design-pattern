package ex95;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Buffer02 {
    public static void main(String[] args) {
        InputStream in = System.in;
        InputStreamReader rd = new InputStreamReader(in);
        char[] buf = new char[4]; // 4칸 짜리 버퍼 (고정)

        try {
            rd.read(buf); // 키보드 입력 대기

            System.out.println(buf[0]);
            System.out.println(buf[1]);
            System.out.println(buf[2]);
            System.out.println(buf[3]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
