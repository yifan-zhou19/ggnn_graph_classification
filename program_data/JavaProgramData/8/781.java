package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static void scanf()
	{
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= m;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void sort()
	{
		int i;
		int j;
		for (i = 1;i < n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (a[i] > a[j])
				{
				a[0] = a[i];
				a[i] = a[j];
				a[j] = a[0];
				}
			}
		}
		for (i = 1;i < m;i++)
		{
			for (j = i + 1;j <= m;j++)
			{
				if (b[i] > b[j])
				{
				b[0] = b[i];
				b[i] = b[j];
				b[j] = b[0];
				}
			}
		}
	}
	public static void merge()
	{
		int i;
		for (i = n + 1;i <= n + m;i++)
		{
			a[i] = b[i - n];
		}
	}
	public static void print()
	{
		int i;
		System.out.print(a[1]);
		for (i = 2;i <= n + m;i++)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		scanf();
		sort();
		merge();
		print();
	}
}

