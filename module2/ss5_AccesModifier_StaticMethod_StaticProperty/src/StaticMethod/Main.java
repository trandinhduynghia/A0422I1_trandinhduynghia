package StaticMethod;

public class Main {
    public static void main(String[] args){
        Student.change();
        Student st1 = new Student(111, "Hoang");
        Student st2 = new Student(222, "Khanh");
        Student st3 = new Student(333, "Nam");

        st1.display();
        st2.display();
        st3.display();
    }
}
