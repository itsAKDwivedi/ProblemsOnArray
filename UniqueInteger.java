import java.util.Arrays;
import java.util.Scanner;

public class UniqueInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        for(i=0; i<n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        int t = a[0];
        int count = 1;
        for(i=1; i<n; i++) {
            if(t!=a[i]) {
                t = a[i];
                count++;
            }
        }
        System.out.println(count>=m);
    }
}
