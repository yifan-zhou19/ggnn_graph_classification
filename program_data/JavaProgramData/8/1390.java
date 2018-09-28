package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int n;
	public static int m;
	public static void duru()
	{
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < m;j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void sort()
	{
		int t1;
		int t2;
		int i;
		int j;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t1 = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t1;
				}
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					t2 = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t2;
				}
			}
		}
	}
	public static void hebing()
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
		for (i = 0;i < n + m - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[n + m - 1]);
		System.out.print("\n");
	}
	public static int Main()
	{
		duru();
		sort();
		hebing();
		put();

		return 0;
	}







}

