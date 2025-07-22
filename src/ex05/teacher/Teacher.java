package ex05.teacher;

public abstract class Teacher implements TeacherAble {
    public void 수업시작() {
        입장하기();
        출석부르기();
        강의하기();
        퇴장하기();
    }


    protected void 입장하기() {
        System.out.println("입장하기");
    }

    protected void 출석부르기() {
        System.out.println("출석부르기");
    }

    // 추상메서드
    protected abstract void 강의하기();


    protected void 퇴장하기() {
        System.out.println("퇴장하기");
    }
}
