package ru.ilukhinayana.uniapp.entity;

public class Student implements StudentAction, GeneralAction {
    String name;
    String surname;
    int yearOfStudy;
    String specialty;

    Professor tutorProfessor;
    University studyUniversity;

    public Student() { // пустой конструктор
    }

    public Student(String name) { // пустой конструктор
    this.name = name;
    }

    @Override
    public void studyingAtLesson() {

    }

    @Override
    public void doHomework() {

    }

    @Override
    public void goToCafeteria() {

    }

    @Override
    public void writeScientificPaper() {

    }
}
