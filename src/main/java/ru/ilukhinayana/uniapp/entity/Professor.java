package ru.ilukhinayana.uniapp.entity;

public class Professor implements ProfessorAction, GeneralAction {
    String initials;
    String surname;
    String teachingSubject;
    //String universityDepartment;
    int numberOfLectures;
    University workUniversity;
    //Student student; // ??

    public Professor() { // пустой конструктор
    }

    public Professor(String surname, String initials, String teachingSubject, int numberOfLectures, University workUniversity) { //полный конструктор
        this.surname = surname;
        this.initials = initials;
        this.teachingSubject = teachingSubject;
        this.numberOfLectures = numberOfLectures;
        this.workUniversity = workUniversity;
    }

    @Override
    public void makeLesson() {
        workbook();
        System.out.println("Я преподаватель, я веду пару");
    }

    private void workbook() { // внутренний метод
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

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getInitials() {
        return initials;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setNumberOfLectures(int numberOfLectures) {
        this.numberOfLectures = numberOfLectures;
    }

    public int getNumberOfLectures() {
        return numberOfLectures;
    }

    public void setWorkUniversity(University workUniversity) {
        this.workUniversity = workUniversity;
    }

    public University getWorkUniversity() {
        return workUniversity;
    }
}