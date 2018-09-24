package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m;
		int p;
		int q;
		int[] a = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = 1;
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = n - 1; i >= 0; i--)
		{
			if (a[i] == k)
			{
				for (m = i; m <= n - p; m++)
				{
					a[m] = a[m + 1];
				}
				p++;
				i++;
			}
		}
		for (q = 0; q <= n - p; q++)
		{
			System.out.print(a[q]);
			if (q != n - p)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}
}

