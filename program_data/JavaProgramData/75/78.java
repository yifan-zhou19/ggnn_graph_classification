import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x1 = new int[1001];
		int[] y1 = new int[1001];
		int i;
		int j = 1;
		int k = 1;
		int sum;
		int lenx;
		int leny;
		int max = 0;
		int count;
		String x = new String(new char[10000]);
		String y = new String(new char[10000]);
		x = new Scanner(System.in).nextLine();
		y = new Scanner(System.in).nextLine();
		lenx = x.length();
		leny = y.length();
		for (i = 0; i <= lenx - 1; i++)
		{
			if (x.charAt(i) != ',')
			{
				x1[j] = x1[j] * 10 + (x.charAt(i) - '0');
			}
			else
			{
				j++;
			}
		}
		for (i = 0; i <= leny - 1; i++)
		{
			if (y.charAt(i) != ',')
			{
				y1[k] = y1[k] * 10 + (y.charAt(i) - '0');
			}
			else
			{
				k++;
			}
		}
		sum = j;
		for (k = 1; k <= 1000; k++)
		{
			count = 0;
			for (j = 1; j <= sum; j++)
			{
				if (x1[j] <= k != 0 && y1[j] > k)
				{
					count += 1;
				}
			}
			if (count > max)
			{
				max = count;
			}
		}
		System.out.print(sum);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");

		return 0;
	}

}
