package <missing>;

public class GlobalMembers
{
	public static int k = 0;
	public static int n;
	public static int[] a = new int[26];
	public static final int y = 1000000;
	public static void lanjie(int i, int m,int h)
	{
		if (i == n + 1)
		{
			if (m > k)
			{
				k = m;
			}
			return;
		}
		if (m + n - i < k)
		{
			return;
		}
		if (h >= a[i])
		{
			lanjie(i + 1, m + 1, a[i]);
		}
		lanjie(i + 1, m, h);
		return;
	}


	public static int Main()
	{
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		lanjie(1, 0, y);
		System.out.print(k);
		System.out.print("\n");

		return 0;
	}
}

