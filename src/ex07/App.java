package ex07;


import ex07.teacher.LectureDelegator;
import ex07.teacher.LectureType;


// Delegate (위임)
public class App {
    public static void main(String[] args) {
        LectureDelegator lectureDelegator = new LectureDelegator();

        // 1.  수학
        lectureDelegator.delegate(LectureType.MATH); // 타입으로 찾아서 위임

        // 2. 역사
        lectureDelegator.delegate(LectureType.HISTORY);  // 타입으로 찾아서 위임
    }
}
