package seol.study.onlinecourse.state;

import seol.study.onlinecourse.Student;

public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);
}
