package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		int l;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = (int)n / 100;
		j = (int)(n - 100 * i) / 50;
		m = (int)(n - 100 * i - 50 * j) / 20;
		l = (int)(n - 100 * i - 50 * j - 20 * m) / 10;
		k = (int)(n - 100 * i - 50 * j - 20 * m - 10 * l) / 5;
		h = n - 100 * i - 50 * j - 20 * m - 10 * l - 5 * k;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d", i, j, m, l, k, h);
		return 0;
	}

}

