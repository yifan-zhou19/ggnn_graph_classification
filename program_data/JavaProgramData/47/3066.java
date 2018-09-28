package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int m = 0;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		if (n % 2 == 1)
		{
			m = n / 2 + 1;
		}
		if (n % 2 == 0)
		{
			m = n / 2;
		}
		for (i = 0;i < m;i++)
		{
			s = a[i];
			a[i] = a[n - 1 - i];
			a[n - 1 - i] = s;
		}
		for (i = 0;i < n;i++)
		{
			if (i < n - 1)
			{
				System.out.print(a[i]);
				System.out.print(' ');
			}
			if (i == n - 1)
			{
				System.out.print(a[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}

}

