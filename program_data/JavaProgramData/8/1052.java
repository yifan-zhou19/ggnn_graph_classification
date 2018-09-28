package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];

	public static void input()
	{
		int i;

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < m; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (i = 0; i < n; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		return;
	}

	public static void paixu()
	{
		int i;
		int j;
		int p;

		for (i = 0; i < m - 1; i++)
		{
		for (j = 0; j < m - 1 - i; j++)
		{
			if (a[j] > a[j + 1])
			{
				p = a[j];
				a[j] = a[j + 1];
				a[j + 1] = p;
			}
		}
		}

		for (i = 0; i < n - 1; i++)
		{
		for (j = 0; j < n - 1 - i; j++)
		{
			if (b[j] > b[j + 1])
			{
				p = b[j];
				b[j] = b[j + 1];
				b[j + 1] = p;
			}
		}
		}

		return;
	}

	public static void output()
	{
		int i;

		System.out.print(a[0]);

		for (i = 1; i < m; i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		for (i = 0; i < n; i++)
		{
			System.out.print(" ");
			System.out.print(b[i]);
		}

		return;
	}

	public static int Main()
	{
		input();
		paixu();
		output();

		return 0;
	}

}

