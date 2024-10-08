class Student {
    private int rollnumber;
    public int getrollnumber() { 
        return rollnumber;

    }
    public void setrollnumber(int userrollnumber) {
     this.rollnumber = userrollnumber;
    
    }
   public String name;

}

public class Incapsulation {
    public static void main(String[]args) {
      Student x = new Student();
      x.setrollnumber(100); 
      x.name = "Rathul" ;    
       System.out.println(" Rollnumber of " + x.name + "is" + x.getrollnumber());
    }

    
}
