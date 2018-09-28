package <missing>;

public class GlobalMembers
{
	public static final int mmax = 1000;
	public static int[] a = new int[mmax]; //??????????????
	public static int[] b = new int[mmax];
	public static int m;
	public static int n;
	public static void mread()
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
	}
	public static void msort()
	{
		int t;
		for (int i = 0;i < m;i++) //????
		{
			for (int j = m - 1;j > i;j--)
			{
				if (a[j - 1] > a[j])
				{
					t = a[j - 1];
					a[j - 1] = a[j];
					a[j] = t;
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = n - 1;j > i;j--)
			{
				if (b[j - 1] > b[j])
				{
					t = b[j - 1];
					b[j - 1] = b[j];
					b[j] = t;
				}
			}
		}
	}
	public static void mcomb()
	{
		for (int i = 0;i < n;i++) //??
		{
			a[i + m] = b[i];
		}
	}
	public static void mdisp()
	{
		for (int i = 0;i < m + n;i++) //???????
		{
			if (i != 0)
			{
				System.out.print(' ');
			}
			System.out.print(a[i]);
		}
	}
	public static int Main()
	{
		mread();
		msort();
		mcomb();
		mdisp();
		return 0;
	}
}

