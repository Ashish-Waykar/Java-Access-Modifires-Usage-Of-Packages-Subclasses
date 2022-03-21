package p2;
import p1.protection;
public class OtherPackage {
public OtherPackage(){
p1.protection p = new p1.protection();
System.out.println();
System.out.println("**********************Other Package ********************");
System.out.println("**********************OtherPackage p2 class********************");
// Default class Or Package Only 
// System.out.println("n = "+n);
// Private inside class Only 
// System.out.println("n_pri = "+n_pri);
// Protected inside Packages & Subclasses Only 
// System.out.println("n_pro= "+n_pro);
System.out.println("n_pub = "+p.n_pub);
System.out.println("**********************OtherPackage p2 Package End ********************");

}}