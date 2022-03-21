package p1;
public class protection{
int n =1 ;
private int n_pri=1;
protected int n_pro=2;
public int n_pub=3;
public protection(){
System.out.println("*************Protection Class***************");

System.out.println(n);
System.out.println("n_pri "+n_pri);
System.out.println("n_pro "+n_pro);
System.out.println("n_pub "+ n_pub);
System.out.println("*************Protection Class End***************");

}

}