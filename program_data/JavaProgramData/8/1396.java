package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int[] c = new int[20000];
	public static int n;
	public static int m;
	public static void input()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0; j < m; j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void sort()
	{
		int temp;
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = 0; j < n - 1 - i; j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < m - 1; i++)
		{
				for (int j = 0; j < m - 1 - i; j++)
				{
					if (b[j] > b[j + 1])
					{
						temp = b[j];
						b[j] = b[j + 1];
						b[j + 1] = temp;
					}
				}
		}
	}
	public static void combine()
	{
		for (int i = 0; i < n; i++)
		{
			c[i] = a[i];
		}
		for (int j = n; j < n + m; j++)
		{
			c[j] = b[j - n];
		}
	}
	public static void out()
	{
		System.out.print(c[0]);
		for (int i = 1; i < n + m; i++)
		{
			System.out.print(" ");
			System.out.print(c[i]);
		}
	}
	public static int Main()
	{
		input();
		sort();
		combine();
		out();
		return 0;
	}
}

