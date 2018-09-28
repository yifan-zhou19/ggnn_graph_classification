package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i = 0;
		int j = 0;
		int r = 0;
		int k = 0;
		int b;
		int e;
		int[] a = new int[10000];
		int[] d = new int[10000];
		int[] f = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m,k = 0;i <= n;i++)
		{
			e = i;
			for (j = 0;e != 0;j++)
			{
				b = e / 10;
				a[j] = e-10 * b;
				e = b;
			}
			j = j - 1;
			for (r = 0;r <= j;r++)
			{
				if (a[r] != a[j - r])
				{
					break;
				}
			}
			if (r >= j + 1)
			{
				d[k] = i;
				k = k + 1;
			}
		}
		k = k - 1;
		for (i = 0,r = 0;i <= k;i++)
		{
			for (j = 2;j < d[i];j++)
			{
				if (d[i] % j == 0)
				{
					break;
				}
			}
			if (j >= d[i])
			{
				f[r] = d[i];
				r = r + 1;
			}
		}
		r = r - 1;
		for (i = 0;i <= r;i++)
		{
			if (f[i + 1] != 0)
			{
				System.out.printf("%d,",f[i]);
			}
			if (f[i + 1] == 0 && f[i] != 0)
			{
				System.out.printf("%d\n",f[i]);
			}
		}
		if (f[0] == 0)
		{
			System.out.print("no\n");
		}
		return 0;
	}
}

