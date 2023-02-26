public class StudentChecker {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.name = "Karol";
        firstStudent.lastName = "Kowalski";
        firstStudent.nick = "Kowal";
        firstStudent.email = "kowal@g.com";
        firstStudent.index = 1111;

        Student secondStudent = new Student();
        secondStudent.name = "Maciek";
        secondStudent.lastName = "Mackowski";
        secondStudent.nick = "Macko";
        secondStudent.email = "macko@g.com";
        secondStudent.index = 2222;

        Student thirdStudent = new Student();
        thirdStudent.name = "Jan";
        thirdStudent.lastName = "Jankowski";
        thirdStudent.nick = "Janko";
        thirdStudent.email = "janko@g.com";
        thirdStudent.index = 3333;

        Student[] students = new Student[]{firstStudent,secondStudent,thirdStudent};
        for(int i = 0; i < students.length; i++ ){
            students[i].introduce();
            students[i].logIn();
            students[i].myEmail();
            students[i].myIndexNumber();
        }
    }
}
