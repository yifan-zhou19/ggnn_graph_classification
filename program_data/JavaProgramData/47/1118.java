package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int[] a = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		if (n % 2 == 0)
		{
			k = n / 2;
			for (i = 1;i <= k;i++)
			{
				t = a[n + 1 - i];
				a[n + 1 - i] = a[i];
				a[i] = t;
			}
		}
		else if (n % 2 != 0)
		{
			k = (n - 1) / 2;
			for (i = 1;i <= k;i++)
			{
				t = a[n + 1 - i];
				a[n + 1 - i] = a[i];
				a[i] = t;
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
			System.out.print(a[n]);

	return 0;
	}
}

