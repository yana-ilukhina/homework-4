package ru.ilukhinayana.uniapp._main;

import ru.ilukhinayana.uniapp.entity.Professor;
import ru.ilukhinayana.uniapp.entity.Student;
import ru.ilukhinayana.uniapp.service.EducationExecutor;

public class _Main {

    public static void main(String[] args) {
        Student student = new Student();
        Professor professor = new Professor();
        EducationExecutor educationExecutor = new EducationExecutor();
        educationExecutor.makeStudentStudying(student);
        educationExecutor.makeStudentDoHomework(student);
        educationExecutor.makeGoToCafeteria(student);
        educationExecutor.makeWriteScientificPaper(student);
        educationExecutor.makeProfessorLesson(professor);
        educationExecutor.makeProfessorCheckHomework(professor);
        educationExecutor.makeGoToCafeteria(professor);
        educationExecutor.makeWriteScientificPaper(professor);


    }


}
