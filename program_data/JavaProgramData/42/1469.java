package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int i;
		int k;
		int j = 0;
		int s;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (j < n - m - 1)
		{
			if (a[j] == k)
			{
				for (s = j; s < n - m - 1; s++)
				{
					a[s] = a[s + 1];
				}
				m++;
			}
			else
			{
				j++;
			}
		}
		if (a[n - m - 1] == k)
		{
			m++;
		}
		System.out.print(a[0]);
		for (i = 1; i < n - m; i++)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}
		return 0;
	}
}

