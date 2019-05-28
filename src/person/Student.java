package person;

import person.consciousness.Knowledge;

public class Student {
    private String name;
    private Knowledge knowledge;

    //Levels of knowledge: 1(low), 2(middle), 3(high)
    public Student(String name, Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public String getName(){
        return name;
    }

    public int getKnowledge(){
        return knowledge.getKnowledge_level();
    }
}