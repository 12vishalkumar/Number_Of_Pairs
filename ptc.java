import java.util.*;
public class ptc
{
public static long numberOfPairs(int n, int[] cost)
    {
        // Write your code here.
        long count = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((cost[i]-(i+1)) == (cost[j]-(j+1)))
                    count++;
            }
        }
        return count;
    }
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int j=0;j<T;j++)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
			System.out.println(numberOfPairs(n, arr));
        }
    }
}