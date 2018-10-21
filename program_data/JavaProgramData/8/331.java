package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static void init()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void sort()
	{
		for (int i = 0;i < m - 1;i++)
		{
			for (int j = m - 1;j > i;j--)
			{
				if (a[j] < a[j - 1])
				{
					int t = a[j - 1];
					a[j - 1] = a[j];
					a[j] = t;
				}
			}
		}
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = n - 1;j > i;j--)
			{
				if (b[j] < b[j - 1])
				{
					int t = b[j - 1];
					b[j - 1] = b[j];
					b[j] = t;
				}
			}
		}
	}
	public static void combine()
	{
		for (int i = m;i < m + n;i++)
		{
			a[i] = b[i - m];
		}
	}
	public static void print()
	{
		for (int i = 0;i < m + n;i++)
		{
			if (i != 0)
			{
				System.out.print(' ');
			}
			System.out.print(a[i]);
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		init();
		sort();
		combine();
		print();
		return 0;
	}

}

