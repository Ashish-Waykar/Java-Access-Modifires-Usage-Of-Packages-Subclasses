class Constr{
  private String name;
  // constructor
  Constr() {
    System.out.println("Constructor Called:");
    name = "Constructor By Ashish";
  }
  public static void main(String[] args) {
    // constructor is invoked while
    // creating an object of the Main class
    Constr obj = new Constr();
    System.out.println("The name is " + obj.name);
  }
}
