package p1;
public class derived extends protection{
int n =1 ;
private int n_pri=1;
protected int n_pro=2;
public int n_pub=3;
public derived(){

System.out.println("*************Derived Class***************");
System.out.println("This Is An Derived Class Constructor ");
System.out.println(n);
//Privete Used By Only Inside Class 
//System.out.println("n_pri "+n_pri);
System.out.println("n_pro "+n_pro);
System.out.println("n_pub "+ n_pub);

System.out.println("*************Derived Class End***************");
}

}