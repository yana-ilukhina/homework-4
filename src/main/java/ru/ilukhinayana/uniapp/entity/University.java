package ru.ilukhinayana.uniapp.entity;

public class University {
    String title;
    String address;
    int yearOfFoundation;
    // int numberOfDepartments; // часть хватит
    //String nameOfRector;
    //Professor professor; // ?? нужно ли? Если отношения один ко многим
    //Student student;

    public University() { // пустой конструктор
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }
}
