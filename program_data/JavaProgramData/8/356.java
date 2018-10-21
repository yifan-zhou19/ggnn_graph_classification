package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[20];
	public static int[] b = new int[20];
	public static int[] c = new int[40];
	public static int la = 0;
	public static int lb = 0;
	public static int read(int[] a, int[] b)
	{
		int i;
		la = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= la;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= lb;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}
	public static int sort(int[] a, int[] b)
	{
		int i;
		int j;
		int change;
		for (i = 1;i < la;i++)
		{
			for (j = 1;j <= la - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					change = a[j];
					a[j] = a[j + 1];
					a[j + 1] = change;
				}
			}
		}
		for (i = 1;i < lb;i++)
		{
			for (j = 1;j <= lb - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					change = b[j];
					b[j] = b[j + 1];
					b[j + 1] = change;
				}
			}
		}
		return 0;
	}
	public static int catenate(int[] a, int[] b, int[] c)
	{
		int i;
		for (i = 1;i <= la;i++)
		{
			c[i] = a[i];
		}
		for (i = 1;i <= lb;i++)
		{
			c[la + i] = b[i];
		}
		return 0;
	}
	public static int print(int[] c, int l)
	{
		int i;
		System.out.print(c[1]);
		for (i = 2;i <= l;i++)
		{
			System.out.print(" ");
			System.out.print(c[i]);
		}
		return 0;
	}
	public static int Main()
	{
		read(a, b);
		sort(a, b);
		catenate(a, b, c);
		print(c, la + lb);
		return 0;
	}
}

