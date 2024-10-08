class Student {
    int ID;
    String name;
    float salary;
    Student() {
    this.ID = 1;
    this.name = "Rathul";

    }
Student(int UserID, String  Username) {
this.ID = UserID;
this.name = Username;

}
Student(int UserID, String Username, float Usersalary) {
    this.ID = UserID;
    this.name = Username;
    this.salary = Usersalary;

} void Displaydata() {
    System.out.println(" My name is " + name);
    System.out.println(" My ID is " + ID);
    System.out.println(" My salary is " + salary);
}

}
public class Methodoverloading {
    public static void main(String [] args) {
        Student student1 = new Student();
       student1.Displaydata();
       Student student2 = new Student(2,"Jim");
       student2.Displaydata();
    }
}