package school_management_system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher hector = new Teacher(1, "Hector", 50000);
        Teacher pacha = new Teacher(2, "Pachapa-nator", 23);
        Teacher pash = new Teacher(3,"Pasha", 200000);

        Student drew = new Student(1,"Drew", 6);
        Student mark = new Student(2, "Mark", 4);
        Student nat = new Student(3, "Natalee", 2);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.addAll(Arrays.asList(hector, pacha, pash));

        List<Student> studentList = new ArrayList<>();

        School win = new School(teacherList, studentList);
        drew.payFees(150000);
        nat.payFees(30000);
        System.out.println(drew.toString());
        System.out.println("The WIN program has earned $" + win.getTotalMoneyEarned());
        mark.payFees(12000);
        System.out.println("The WIN program has earned $" + win.getTotalMoneyEarned());
        System.out.println("-----------Making WIN pay salaries------------");
        pacha.recieveSalary(pacha.getSalary());
        System.out.println("WIN has paid a salary to "+pacha.getName()+ " and now has $"+ win.getTotalMoneyEarned());
        hector.recieveSalary(hector.getSalary());
        System.out.println("WIN has paid a salary to "+hector.getName()+ " and now has $"+ win.getTotalMoneyEarned());
        System.out.println(pash.toString());







    }
}
