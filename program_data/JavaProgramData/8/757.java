package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int m;
	public static int n;
	public static int[] c = new int[200];
	public static int shuru()
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
		return 0;
	}
	public static int paixu()
	{
		int i = 0;
		int j = 0;
		int t = 0;
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		return 0;
	}
	public static int hebing()
	{
		for (int i = 0;i < m;i++)
		{
			c[i] = a[i];
		}
		for (int i = m;i < m + n;i++)
		{
			c[i] = b[i - m];
		}
		return 0;
	}
	public static int shuchu()
	{
		System.out.print(c[0]);
		for (int i = 1;i < m + n;i++)
		{
			System.out.print(" ");
			System.out.print(c[i]);
		}
		return 0;
	}

	public static int Main()
	{
		shuru();
		paixu();
		hebing();
		shuchu();
		return 0;
	}

}

