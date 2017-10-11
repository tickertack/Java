public class Employee {
  private String name;
  private double salary;

  public String getName() {
    return name;
  }
  
  public double getSalary() {
    return salary;
  }
  
  public void setSalary(double salary) {
    this.salary = salary;
  }
  
  public Employee(String name) {
// salary automatically set to zero
    this.name = name;
  }
  
  public Employee(double salary) {
    this.name = "";
    this.salary = salary;
  }
  
  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }
    
  public void raiseSalary(double byPercent) {
    double raise = salary * byPercent / 100;
    salary += raise;
  }
  
  public static void main(String[] args) {
    /*
    To make a conversion that is not among these permitted ones, use a cast
    operator: the name of the target type in parentheses. For example,
    In this case, the fractional part is discarded, and n is set to 3.
    */
    double x = 3.75;
    int n = (int) x;

    double f = 3500.25;
    int i = (int)f;
    Employee e = new Employee("Larry", f);
    
    System.out.println("i= " + i);
    System.out.println(e.getName());
    System.out.println(e.getSalary());
  }
}
