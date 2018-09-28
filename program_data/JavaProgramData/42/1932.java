package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100001];
		int k;
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
		  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i < n; i++)
		{
			if (a[i] != k)
			{
			  continue;
			}
			for (j = i + 1; (j <= n) && (a[j] == k); j++)
			{
				;
			}
			if (j > n)
			{
			  break;
			}
			a[i] = a[j];
			a[j] = k;
		}
		if (a[1] != k)
		{
		  System.out.print(a[1]);
		}
		for (i = 2; (i <= n) && (a[i] != k); i++)
		{
		  System.out.print(' ');
		  System.out.print(a[i]);
		}
		return (0);
	}
}

