import java.util.*;
public class ConsecutiveOddSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    int i,j;
    for(i=0; i<n; i++) {
      arr[i] = sc.nextInt();
    }
    int count = 0;
    for(i=0; i<n; i++) {
      int sum = 0;
      for(j=i; j<n; j++) {
        sum+=arr[j];
        if(sum%2!=0)
        count++; 
      }
    }
    System.out.println(count);
  }
}
