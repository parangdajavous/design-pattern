package ex05;

import ex05.teacher.HTMLTeacher;
import ex05.teacher.JavaTeacher;
import ex05.teacher.PythonTeacher;
import ex05.teacher.Teacher;

public class App {
    public static void main(String[] args) {
        Teacher jt = new JavaTeacher();
        jt.수업시작();

        Teacher pt = new PythonTeacher();
        pt.수업시작();

        Teacher htt = new HTMLTeacher();
        htt.수업시작();
    }
}
