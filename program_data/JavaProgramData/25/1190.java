package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[200];

	public static void f(int n)
	{
		int i;
		int m = 100;
		int temp = 0;
		while (a[m] == 0)
		{
			m--;
		}
		if (n == 0)
		{
			for (i = m; i >= 1; i--)
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
			return;
		}
		for (i = 1; i <= m; i++)
		{
			a[i] = a[i] * 2 + temp;
			temp = 0;
			if (a[i] >= 10)
			{
				temp = a[i] / 10;
				a[i] = a[i] - 10;
			}
		}
		if (temp != 0)
		{
			a[m + 1] = temp;
		}
		f(n - 1);
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1] = 1;
		f(n);
		return 0;
	}
}

