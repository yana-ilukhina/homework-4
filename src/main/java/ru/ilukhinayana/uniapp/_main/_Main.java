package ru.ilukhinayana.uniapp._main;

import ru.ilukhinayana.uniapp.entity.Professor;
import ru.ilukhinayana.uniapp.entity.Student;
import ru.ilukhinayana.uniapp.entity.University;
import ru.ilukhinayana.uniapp.service.EducationExecutor;

public class _Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        Professor professor1 = new Professor();
        University university1 = new University();
        EducationExecutor educationExecutor = new EducationExecutor();
        student1.setName("Станислав");
        student1.setSurname("Родионов");
        student1.setYearOfStudy(3);
        student1.setSpecialty("Менеджмент");
        student1.setCuratorProfessor(professor1);
        student1.setStudyUniversity(university1);
        university1.setTitle("МГУ");
        university1.setAddress("г. Москва, Ленинские горы, д. 1");
        university1.setYearOfFoundation(1755);
        professor1.setSurname("Клыкова");
        professor1.setInitials("А.А.");
        professor1.setTeachingSubject("Основы менеджмента");
        professor1.setNumberOfLectures(128);
        professor1.setWorkUniversity(university1);
        Professor professor2 = new Professor("Солнцев", "Д.М.", "Основы международных отношений", 116, university1);
        Student student2 = new Student("Ян", "Бакинов", 4, "Международные отношения", professor2, university1);

        System.out.println("Я студент " + student1.getSurname() + " " + student1.getName() + ", учусь в " +
                student1.getStudyUniversity().getTitle() + " на " + student1.getYearOfStudy() + " курсе " +
                "по специальности " + student1.getSpecialty() + ", мой куратор -- " +
                student1.getCuratorProfessor().getSurname() + " " + student1.getCuratorProfessor().getInitials());
        // вызов не professor1.getSurname(), а student1.getCuratorProfessor().getSurname()
        System.out.println("Я преподаватель " + professor1.getSurname() + " " + professor1.getInitials() +
                ", веду предмет " + professor1.getTeachingSubject() + " в " + professor1.getWorkUniversity().getTitle() +
                ", нагрузка в месяц " + professor1.getNumberOfLectures() + " академических часов");
        System.out.println("Я студент " + student2.getSurname() + " " + student2.getName() + ", учусь в " +
                student2.getStudyUniversity().getTitle() + " на " + student2.getYearOfStudy() + " курсе " +
                "по специальности " + student2.getSpecialty() + ", мой куратор -- " +
                student2.getCuratorProfessor().getSurname() + " " + student2.getCuratorProfessor().getInitials());
        System.out.println("Я преподаватель " + professor2.getSurname() + " " + professor2.getInitials() +
                ", веду предмет " + professor2.getTeachingSubject() + " в " + professor2.getWorkUniversity().getTitle() +
                ", нагрузка в месяц " + professor2.getNumberOfLectures() + " академических часов");
        System.out.println("Место учебы/работы: " + university1.getTitle() + ", по адресу: " + university1.getAddress() + ", год основания: " +
                university1.getYearOfFoundation());

        educationExecutor.makeStudentStudying(student1);
        educationExecutor.makeStudentDoHomework(student1);
        educationExecutor.makeGoToCafeteria(student1);
        educationExecutor.makeWriteScientificPaper(student1);
        educationExecutor.makeProfessorLesson(professor1);
        educationExecutor.makeProfessorCheckHomework(professor1);
        educationExecutor.makeGoToCafeteria(professor1);
        educationExecutor.makeWriteScientificPaper(professor1);
    }
}