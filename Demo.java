//Encapsulation Lesson

class Human {
    private int age;
    private String name = "John";

    //constructor
    protected Human(){ //'Public' and 'Protected' works similar, only if both the class and sub-class are defined in the same file
        System.out.println("In Default Constructor.");
        age = 10;
        name = "Riya";
    }

    public Human( String _name, int _age){
        System.out.println("In Paramterized Constructor.");
        this.age = _age;
        this.name = _name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int _age){
        age = _age;
    }

    public void setName(String _name){
        name = _name;
    }
}

public class Demo {
    public static void main(String args[]){
        Human human_obj = new Human();
        System.out.println("Before Assignment 1");
        System.out.println(human_obj.getName() + " : " + human_obj.getAge());

        Human human_obj_2 = new Human("Nick", 33);
        System.out.println("Before Assignment 2");
        System.out.println(human_obj_2.getName() + " : " + human_obj_2.getAge());

        human_obj.setName("Rakesh");
        human_obj.setAge(57);
        System.out.println("After Assignment");
        System.out.println(human_obj.getName() + " : " + human_obj.getAge());
        ;
    }
}

