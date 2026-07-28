abstract class StudentEvaluation {
    String name;
    int rollNo;

    public StudentEvaluation(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}