package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int m;
	public static int n;
	public static void shuru()
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
	public static void paixu(int[] f, int length)
	{
		int x;
		for (int i = 0;i < length - 1;i++)
		{
			for (int j = 0;j <= length - 2 - i;j++)
			{
				if (f[j] > f[j + 1])
				{
					x = f[j];
					f[j] = f[j + 1];
					f[j + 1] = x;
				}
			}
		}
	}
	public static void shuchu()
	{
		int i;
		for (i = 0;i < m;i++)
		{
				System.out.print(a[i]);
				System.out.print(' ');
		}
		for (i = 0;i < n - 1;i++)
		{
					System.out.print(b[i]);
					System.out.print(' ');
		}
		System.out.print(b[i]);
		System.out.print("\n");
	}
	public static int Main()
	{
		shuru();
		paixu(a, m);
		paixu(b, n);

		shuchu();
	}


}

