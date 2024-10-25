package ru.ilukhinayana.uniapp.entity;

public class Student implements StudentAction, GeneralAction {
    String name;
    String surname;
    int yearOfStudy;
    String specialty;

    Professor curatorProfessor;
    University studyUniversity;

    public Student() { // пустой конструктор
    }

    public Student(String name, String surname, int yearOfStudy, String specialty, Professor curatorProfessor, University studyUniversity) { //полный конструктор
    this.name = name;
    this.surname = surname;
    this.yearOfStudy = yearOfStudy;
    this.specialty = specialty;
    this.curatorProfessor = curatorProfessor;
    this.studyUniversity = studyUniversity;
    }

    @Override
    public void studyingAtLesson() {
        copybook();
        System.out.println("Я студент, я сижу на паре и учусь");
    }

    private void copybook() {
        System.out.println("Я студент, я достаю свою тетрадь");
    }

    @Override
    public void doHomework() {
        copybook();
        System.out.println("Я студент, я сижу делаю домашку, учусь");
    }

    @Override
    public void goToCafeteria() {
        System.out.println("Я студент и я проголодался, пойду поем в столовке");
    }

    @Override
    public void writeScientificPaper() {
        System.out.println("Я студент, мне сказали написать какую-нибудь научную статью");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setCuratorProfessor(Professor curatorProfessor) {
        this.curatorProfessor = curatorProfessor;
    }

    public Professor getCuratorProfessor() {
        return curatorProfessor;
    }

    public void setStudyUniversity(University studyUniversity) {
        this.studyUniversity = studyUniversity;
    }

    public University getStudyUniversity() {
        return studyUniversity;
    }
}


