package ex07.teacher;

public interface Teacher {
    void doLecture();

    boolean isSameLecture(LectureType lectureType);  // 책임: 누구한테 위임할지 결정
}
