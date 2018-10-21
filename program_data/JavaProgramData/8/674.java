package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int m;
	public static int n;
	public static void init() //???
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 1;i <= m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	public static void s() //??
	{
		sort(a,a + m + 1);
		sort(b,b + n + 1);
	}
	public static void merge() //??
	{
		int i;
		for (i = 1;i <= n;i++)
		{
		a[i + m] = b[i];
		}
	}
	public static void print() //??
	{
		int i;
		for (i = 1;i <= m + n;i++)
		{
			System.out.print(a[i]);
			if (i < m + n)
			{
				System.out.print(' ');
			}
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		init();
		s();
		merge();
		print();
		return 0;
	}

}

