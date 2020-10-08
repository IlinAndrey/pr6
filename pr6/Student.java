package ru.mirea.pr6;

public class Student<id> {
    private int id;
    private int gpa;
    private String name;
    private String group;


    public Student(){}


    public Student(int id, int gpa, String name, String group) {
        this.id = id;
        this.gpa = gpa;
        this.name = name;
        this.group = group;
    }

    public Student(int id, int math, int rus, int inf, String name, String group) {
        this.id = id;
        this.gpa = math + rus + inf;
        this.name = name;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public int getGpa() {
        return gpa;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", gpa=" + gpa +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
