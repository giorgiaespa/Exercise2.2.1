import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Daniel", 25);
        Student s2 = new Student("Zakariaa", 22);
        Student s3 = new Student("Giorgia", 23);
        ArrayList <Student> classroom = fill(s1,s2,s3);
        System.out.println("creato arraylist con n elementi: \n" + classroom);

        Student s4 = new Student("Alessia", 22);
        Student s5 = new Student("Luca", 19);
        Student s6 = new Student("Alessandra", 23);
        Student s7 = new Student("Thomas", 19);
        ArrayList <Student> newStudents = add(s4,s5,s6,s7);

        classroom.addAll(newStudents);

        System.out.println("arraylist aggiornato: \n" + classroom);
    }
    public static ArrayList<Student> fill (Student s1, Student s2, Student s3){
        return new ArrayList<>(Arrays.asList(s1, s2, s3));
    }

    public static ArrayList<Student> add (Student s4, Student s5, Student s6, Student s7){
        ArrayList<Student>classroom = new ArrayList<>();
        classroom.add(s4);
        classroom.add(s5);
        classroom.add(s6);
        classroom.add(s7);
        return classroom;
    }

}