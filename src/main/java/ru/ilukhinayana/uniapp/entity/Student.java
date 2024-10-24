package ru.ilukhinayana.uniapp.entity;

public class Student implements StudentAction, GeneralAction {
    String name;
    String surname;
    int yearOfStudy;
    String specialty;

    Professor tutorProfessor;
    University studyUniversity;

    /*public Student() { // пустой конструктор
    }

    public Student(String name) { // не-пустой конструктор
    this.name = name;
    }*/

    @Override
    public void studyingAtLesson() {
        copybook();
        System.out.println("Я студент, я сижу на паре у учусь");
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
}
