package ex07.teacher;

import java.util.ArrayList;
import java.util.List;

// 책임: 요청에 맞는 전문가를 찾아서 위임 - 단일진입점
// 단일 진입점을 만들면 좋은 이유 - 하나의 오브젝트만 바라볼 수 있음
public class LectureDelegator {
    private List<Teacher> teachers = new ArrayList<>();

    public LectureDelegator() {
        teachers.add(new HistoryTeacher());
        teachers.add(new MathTeacher());
    }

    public void delegate(LectureType lectureType) {
        teachers
                .stream()
                .filter(teacher -> teacher.isSameLecture(lectureType))
                .forEach(teacher -> {
                    teacher.doLecture();
                });

    }

}
