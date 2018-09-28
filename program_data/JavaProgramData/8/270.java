package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int n;
	public static int m;
	public static void read()
	{
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < m;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void paixu()
	{
		int i;
		int j;
		int tem;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					tem = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tem;
				}
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					tem = b[j];
					b[j] = b[j + 1];
					b[j + 1] = tem;
				}
			}
		}
	}
	public static void combine()
	{
		int i;
		for (i = n;i < n + m;i++)
		{
			a[i] = b[i - n];
		}
	}
	public static void put()
	{
		int i;
		for (i = 0;i < m + n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[i]);
		System.out.print("\n");
	}
	public static int Main()
	{
		read();
		paixu();
		combine();
		put();
		return 0;
	}

}

