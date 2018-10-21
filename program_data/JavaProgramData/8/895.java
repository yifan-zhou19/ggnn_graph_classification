package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int m;
	public static int n;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int c;
	public static void f(int[] a, int m)
	{
		for (i = 0;i < m - 1;i++)
		{
			for (int j = 0;j < m - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					c = a[j];
					a[j] = a[j + 1];
					a[j + 1] = c;
				}
			}
		}
		System.out.print(a[0]);
		for (i = 1;i < m;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		f(a, m);
		for (i = 0;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(" ");
		f(b, n);
		return 0;
	}

}

