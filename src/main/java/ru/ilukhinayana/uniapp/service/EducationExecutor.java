package ru.ilukhinayana.uniapp.service;

import ru.ilukhinayana.uniapp.entity.GeneralAction;
import ru.ilukhinayana.uniapp.entity.ProfessorAction;
import ru.ilukhinayana.uniapp.entity.StudentAction;

public class EducationExecutor {

    public void makeStudentStudying(StudentAction studentAction) {
        studentAction.studyingAtLesson();
    }

    public void makeStudentDoHomework(StudentAction studentAction) {
        studentAction.doHomework();
    }

    public void makeProfessorLesson(ProfessorAction professorAction) {
        professorAction.makeLesson();
    }

    public void makeProfessorCheckHomework(ProfessorAction professorAction) {
        professorAction.checkHomework();
    }

    public void makeGoToCafeteria(GeneralAction generalAction) {
        generalAction.goToCafeteria();
    }

    public void makeWriteScientificPaper(GeneralAction generalAction) {
        generalAction.writeScientificPaper();
    }
}
