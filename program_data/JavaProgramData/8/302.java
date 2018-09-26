package <missing>;

public class GlobalMembers
{
	public static int n; //??????n,m?????????????
	public static int m;
	public static void reset1(int[] a)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}
	public static void reset2(int[] b)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
	}
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
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
		reset1(a);
		reset2(b);
		for (i = 0;i < n;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.print(b[i]);
			System.out.print(' ');
		}
		System.out.print(b[m - 1]);
		System.in.read();
		System.in.read();
		return 0;
	}
}

