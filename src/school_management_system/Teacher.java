package school_management_system;

public class Teacher {
    private int id;
    private String name;
    private int salary;

    private int salaryEarned;

    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        salaryEarned = 0;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

    public void setSalary(int x){
        salary = x;
    }

    @Override
    public String toString() {
        return "Name of the teacher: " + getName()+ " Total salary earned so far $" + salaryEarned;
    }

    public void recieveSalary(int x){
        salaryEarned+=x;
        School.updateTotalMoneySpent(x);
    }
}
