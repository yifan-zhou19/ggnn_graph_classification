import java.util.*;

package <missing>;

public class GlobalMembers
{
	// ????? ?? 1000062708
	public static int Main()
	{
		int i;
		int j;
		int n1;
		int n2;
		int t;
		int m = 1;
		int z;
		int[] x = new int[1000];
		int[] y = new int[1000];
		String a = new String(new char[100000]);
		String b = new String(new char[100000]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n1 = a.length();
		n2 = b.length();
		i = 0;
		for (j = 0;j < n1;j++)
		{
			if (a.charAt(j) != ',')
			{
				x[i] = x[i] * 10 + (a.charAt(j) - '0');
			}
			else
			{
				i++;
			}
		}
		i = 0;
		for (j = 0;j < n2;j++)
		{
			if (b.charAt(j) != ',')
			{
				y[i] = y[i] * 10 + (b.charAt(j) - '0');
			}
			else
			{
				i++;
			}
		}
		t = i + 1;
		for (i = 0;i <= 1000;i++)
		{
			z = 0;
			for (j = 0;j < t;j++)
			{

				if (x[j] <= i != 0 && y[j] >= i + 1)
				{
					z++;
				}
			}
			if (z > m)
			{
				m = z;
			}

		}
		System.out.print(t);
		System.out.print(" ");
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}


}
