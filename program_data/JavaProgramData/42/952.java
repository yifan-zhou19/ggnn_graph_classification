package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int k;
		int m = 0;
		int q = 0;
		int i;
		int j;
		int r;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (r = 0; r < n; r++)
		{
			a[r] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n - m ; i++)
		{
			if (a[i] == k)
			{
				for (j = i; j < n - m; j++)
				{
					a[j] = a[j + 1];
				}
				m++;
				i--;
			}
		}
		for (q = 0; q < n - m - 1; q++)
		{
			System.out.print(a[q]);
			System.out.print(" ");
		}
		if (q == n - m - 1)
		{
			System.out.print(a[q]);
		}
		return 0;
	}
}

