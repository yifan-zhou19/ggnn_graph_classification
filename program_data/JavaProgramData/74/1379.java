package <missing>;

public class GlobalMembers
{
	public static int[] ans = new int[10000];
	public static int[] a = new int[100];

	public static int Main()
	{
		int l;
		int r;
		int i;
		int s;
		int anses = 0;
		int bo;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			r = Integer.parseInt(tempVar2);
		}
		while (l <= r)
		{
			bo = 1;
			for (i = 2; i * i <= l; i++)
			{
				if (l % i == 0)
				{
					bo = 0;
				}
			}
			for (s = l, t = 0; s != 0; s /= 10)
			{
				a[t++] = s % 10;
			}
			for (i = 0; i < t / 2; i++)
			{
				if (a[i] != a[t - i - 1])
				{
					bo = 0;
				}
			}
			if (bo != 0)
			{
				ans[++anses] = l;
			}
			l++;
		}
		if (anses == 0)
		{
			System.out.print("no");
		}
		for (i = 1; i < anses; i++)
		{
			System.out.printf("%d,", ans[i]);
		}
		if (anses != 0)
		{
			System.out.printf("%d", ans[anses]);
		}
	}

}

