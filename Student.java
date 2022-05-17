public class Student {

  private String Name;
  private int Age;
  private String Born;

  public Student(String name, int age, String born) {
    Name = name;
    Age = age;
    Born = born;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
   public String GetBorn() {return Born;}

  public String ToString() {
    return Name + " " + Integer.toString(Age)+" "+Born;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error", -1,"Parse Error");
    return new Student(data[0], Integer.parseInt(data[1]),data[2]);
  }
}