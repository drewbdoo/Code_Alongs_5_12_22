package school_management_system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade){
        feesPaid=0;
        feesTotal=30000;
        this.id=id;
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(int x){
        grade = x;
    }
    public void updateFeesPaid(int x){
        feesPaid += x;
    }

    public int getId() {
        return id;
    }

    public void payFees(int feesPaid) {
        this.feesPaid = feesPaid;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name " + getName() + " Total fee's paid so far $" + feesPaid;
    }
}
