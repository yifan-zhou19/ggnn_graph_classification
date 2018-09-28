package <missing>;

public class GlobalMembers
{
	public static int la;
	public static int lb;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static void get()
	{
		for (int i = 0;i < la;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < lb;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void sort()
	{
		int i;
		int j;
		int p = a[0];
		for (i = 0;i < la - 1;i++)
		{
			for (j = 0;j <= la - i - 2;j++)
			{
				if (a[j] > a[j + 1])
				{
						p = a[j];
					a[j] = a[j + 1];
					a[j + 1] = p;
				}
			}
		}
		p = b[0];
		for (i = 0;i < lb - 1;i++)
		{
				for (j = 0;j <= lb - i - 2;j++)
				{
					if (b[j] > b[j + 1])
					{
							p = b[j];
						b[j] = b[j + 1];
						b[j + 1] = p;
					}
				}
		}
	}
	public static void link()
	{
		int i;
		for (i = la;i <= la + lb - 1;i++)
		{
			a[i] = b[i - la];
		}
	}
	public static void print()
	{
		int i;
		for (i = 0;i < la + lb - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[la + lb - 1]);
	}
	public static int Main()
	{
		la = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		get();
		sort();
		link();
		print();
		return 0;
	}
}

