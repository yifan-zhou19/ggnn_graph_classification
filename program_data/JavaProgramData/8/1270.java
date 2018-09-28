package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[100];
	public static int[] b = new int[100];

	public static void read()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1;i <= n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	public static void sort_()
	{
		sort(a + 1,a + m + 1);
		sort(b + 1,b + n + 1);
	}

	public static void stick()
	{
		for (int i = 1;i <= n;i++)
		{
			a[m + i] = b[i];
		}
	}

	public static void print()
	{
		for (int i = 1;i < m + n;i++)
		{
		System.out.print(a[i]);
		System.out.print(' ');
		}
		System.out.print(a[m + n]);
	}


	public static int Main()
	{
		read();
		sort_();
		stick();
		print();

		return 0;
	}

}

