import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x_in = new String(new char[10000]);
		String y_in = new String(new char[10000]);
		int i;
		int j = 0;
		int n1;
		int n2;
		int n3;
		int[] x = new int[10000];
		int[] y = new int[10000];
		int k = 0;
		int[] count = new int[1000];
		int max = 0;
		x_in = new Scanner(System.in).nextLine();

		y_in = new Scanner(System.in).nextLine();
		n1 = x_in.length();
		n3 = y_in.length();
		for (i = n1;i >= 0;i--)
		{
			if (x_in.charAt(i) <= '9' && x_in.charAt(i) >= '0')
			{
				x[j] = x[j] + (x_in.charAt(i) - '0') * Math.pow(10.0,k);
				k++;
			}
			else if ((x_in.charAt(i - 1) <= '9' && x_in.charAt(i - 1) >= '0') && (x_in.charAt(i) < '0' || x_in.charAt(i)>'9'))
			{
				k = 0;
				j++;
			}
		}
		n2 = j;
		j = 0;
		k = 0;
		for (i = n3;i >= 0;i--)
		{
			if (y_in.charAt(i) <= '9' && y_in.charAt(i) >= '0')
			{
				y[j] = y[j] + (y_in.charAt(i) - '0') * Math.pow(10.0,k);
				k++;
			}
			else if ((y_in.charAt(i - 1) <= '9' && y_in.charAt(i - 1) >= '0') && (y_in.charAt(i) < '0' || y_in.charAt(i)>'9'))
			{
				k = 0;
				j++;
			}
		}
		for (i = 1;i < 1000;i++)
		{
			for (j = 0;j <= n2;j++)
			{
				if (i >= x[j] != 0 && i < y[j])
				{
					count[i]++;
				}
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (count[i] > max)
			{
				max = count[i];
			}
		}
		System.out.print(n2);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}




}
