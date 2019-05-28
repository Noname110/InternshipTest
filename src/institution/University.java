package institution;

import person.Student;

import java.util.LinkedList;

public class University {
    private String name;
    LinkedList<Student> list = new LinkedList<>();

    public University(String name) {
        this.name = name;
    }

    //student replacement
    public void setStudent(Student student, Student new_student) {
        if(list.contains(student)) {
            list.remove(student);
            list.add(new_student);
        }
        else
            addStudent(new_student);
    }

    public void addStudent(Student student) {
        list.add(student);
    }

    public  LinkedList<Student> getList(){
        return list;
    }
}