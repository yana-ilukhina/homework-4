package ru.ilukhinayana.uniapp.entity;

public class Professor implements ProfessorAction, GeneralAction {
    String name;
    String surname;
    String teachingSubject;
    String universityDepartment;
    int numberOfLectures;

    University workUniversity;
    Student student; // ??

    @Override
    public void makeLesson() {
        workbook();
        System.out.println("Я преподаватель, я веду пару");
    }

    private void workbook() {
        System.out.println("Я преподаватель, я достаю свои учебники, конспекты и материалы");
    }

    @Override
    public void checkHomework() {
        workbook();
        System.out.println("Я преподаватель, я проверяю дз студентов");
    }

    @Override
    public void goToCafeteria() {
        System.out.println("Я преподаватель и я проголодался, пойду поем в столовой");
    }

    @Override
    public void writeScientificPaper() {
        System.out.println("Я преподаватель, мне надо написать крутую научную статью");
    }
}
