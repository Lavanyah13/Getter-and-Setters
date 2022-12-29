class Employee()
{
  String name;
  private int emp_id;
  
  public void set_id(int id)
  {
    if(id>0)
     emp_id=id;
    else
      System.out.println("Invalid ID);
  }
  
  public int get_id()
  {
    return emp_id;
  }
  
  public void set_name(String n)
    {
        name=n;
    }
}
class Office{
  public static void main ( String [] args){
    Employee e= new Employee ();
    e.set_id(181);
    e.set_name("LAVA");
    System.out.println(get_id()+ " " + e.name);
  }
}
