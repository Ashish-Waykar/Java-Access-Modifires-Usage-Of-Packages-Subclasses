package p1;
public class samepackage{
public static void main (String []args){
protection p = new protection();
System.out.println("*************SamePackage Class***************");

System.out.println("Same Package Constructor ");

System.out.println("n = "+p.n);
// Private Accessiable only within class 
//System.out.println("n = "+p.n_pri);
System.out.println("n = "+p.n_pub);
System.out.println("n = "+p.n_pro);
System.out.println("*************SamePackage End***************");

}
}