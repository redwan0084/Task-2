package redowan;

public class Student {
    String name ;
    int id ;
    static String universityName="Leading University";
    Student (){
        System.out.println("Default Constructor ");
    }
    Student (int id){

        this.id=id;
    }

    Student (int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("Id:"+id+"Name:"+name);

    }
    void display(){
        System.out.println("University Name:"+universityName);
    }
}
