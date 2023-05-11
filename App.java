import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        User u1 = new User("Сергей","Иванов",25);
        Student s1 = new Student("Марина", "Степанова", 22, (long)101);
        Student s2 = new Student("Антон", "Алексеев", 22, (long)111);
        Student s3 = new Student("Никита", "Василев", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Лена", "Никитина", 23, (long)171);
        Student s6 = new Student("Лена", "Славина", 23, (long)104);
        Student s7 = new Student("Влад", "Петрович", 23, (long)100);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);
        listStud1.add(s7);

        StudentGroup group1 = new StudentGroup(listStud1);


        Student ss1 = new Student("Александр", "Иванов", 28, (long)102);
        Student ss2 = new Student("Пётр", "Сидоров", 24, (long)113);
        Student ss3 = new Student("Дмитрий", "Петров", 22, (long)131);
        Student ss4 = new Student("Михаил", "Иванов", 25, (long)315);
        Student ss5 = new Student("Екатерина", "Пчелкина", 26, (long)180);
        Student ss6 = new Student("Алёна", "Славина", 27, (long)110);
        

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(ss1);
        listStud2.add(ss2);
        listStud2.add(ss3);
        listStud2.add(ss4);
        listStud2.add(ss5);
        listStud2.add(ss6);
        

        StudentGroup group2 = new StudentGroup(listStud2);

        List<StudentGroup> steam1 = new ArrayList<StudentGroup>();
        steam1.add(group1);
        steam1.add(group2);

        StudentSteam steam = new StudentSteam(steam1);
        
        for(StudentGroup group : steam)
        {
            for(Student stud : group)
        {
            System.out.println(stud);
        }
        }
        
        System.out.println("============= после сортировки =============");
        Collections.sort(steam.getSteam());

        for(StudentGroup group : steam)
        {
            for(Student stud : group)
        {
            System.out.println(stud);
        }
        }
}}