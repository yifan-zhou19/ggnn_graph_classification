package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100000];
		int i;
		int j;
		int m;
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		m = n;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < m; i++)
		{
			if (a[i] == k)
			{
				m = m - 1;
				for (j = i; j < n - 1; j++)
				{
					a[j] = a[j + 1];
				}
				i = i - 1;
			}
		}
		System.out.print(a[0]);
		for (i = 1; i < m; i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	}
}

