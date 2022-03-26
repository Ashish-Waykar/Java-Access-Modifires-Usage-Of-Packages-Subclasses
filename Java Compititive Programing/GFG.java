// Java program to print all numbers between 1
// to N in reverse order
import java.util.*;
class GFG {
// Recursive function to print from N to 1
static void PrintReverseOrder(int N)
{
for (int i = N; i > 0; i--) // for reverse the loop
	 System.out.print( +i + " ");
}
// Driver code
public static void main(String[] args)
{
	int N = 5;
	PrintReverseOrder(N);
}
}
