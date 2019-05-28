package institution.interlink;

import person.Student;
import institution.University;

import java.util.LinkedList;

public class Internship {
    private String name;
    LinkedList<Student> intern = new LinkedList<>();

    public Internship(String name) {
        this.name = name;
    }

    public void addStudents(University university) {
        for (Student s : university.getList()){
            if(s.getKnowledge() > 2){
                intern.add(s);
            }
        }
    }

    public void getStudents() {
        System.out.printf("%10s%25s", "Name", "Knowledge level\n");
        for(Student stud : intern){
            System.out.println(stud.getName() + ":\t\t " + stud.getKnowledge());
        }
    }
}