public class RevMultiplicationTable {
    public static void main(String[] args) {
       int num = 5;
        for(int i = 10; i >= 1; i--)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}