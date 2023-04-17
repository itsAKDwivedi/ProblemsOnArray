import java.util.Scanner;

public class MaxWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("height = ");
        int height[] = new int[n];
        int i,j,vol,max_vol=0;
        for(i=0; i<n; i++)
            height[i] = sc.nextInt();
        for(i=0; i<n-1; i++) {
            for(j=i+1; j<n; j++) {
                vol = Math.min(height[i], height[j]) * (j-i);
                if(vol>max_vol)
                max_vol = vol;
            }
        }
        System.out.println(max_vol);
    }
}
