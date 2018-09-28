import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[10000]);
		String y = new String(new char[10000]);
		int[] c = new int[2000];
		int[] g = new int[2000];
		int[] a = new int[2000];
		int l1 = -1;
		int l2 = 0;
		int num1 = 0;
		int num2 = 0;
		int i = 0;
		int k;
		int max;

		x = new Scanner(System.in).nextLine();

		while (x.charAt(i) != '\0')
		{
			num1++;
			for (;x.charAt(i) != ',' && x.charAt(i) != '\0';i++)
			{
				l2++;

			}


			for (k = l2 - l1 - 2;k >= 0;k--,l1++)
			{

				c[num1] = c[num1] + (int)Math.pow(10.0,k) * (x.charAt(l1 + 1) - '0');

			}
			if (x.charAt(i) == '\0')
			{
					break;
			}
			l1 = l2,i++;
			l2++;
		}
		y = new Scanner(System.in).nextLine();
		i = 0,l2 = 0,l1 = -1;
		while (y.charAt(i) != '\0')
		{
			num2++;
			for (;y.charAt(i) != ',' && y.charAt(i) != '\0';i++)
			{
				l2++;

			}


			for (k = l2 - l1 - 2;k >= 0;k--,l1++)
			{

				g[num2] = g[num2] + (int)Math.pow(10.0,k) * (y.charAt(l1 + 1) - '0');

			}
			if (y.charAt(i) == '\0')
			{
					break;
			}
			l1 = l2,i++;
			l2++;
		}
		for (i = 1;i <= num1;i++)
		{
		   for (k = c[i];k < g[i];k++)
		   {
			   a[k]++;
		   }
		}
		max = 0;
		for (i = 0;i <= 999;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
			System.out.print(num1);
			System.out.print(" ");
			System.out.print(max);
			System.out.print("\n");
			return 0;
	}





























}
