package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int e;
		int p = 0;
		int[] sz = new int[301];
		double q;
		double c;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			p += sz[i];
		}
		q = (double)p / n;
		for (int j = 0;j < n - 1;j++)
		{
			if (sz[j] > sz[j + 1])
			{
				e = sz[j + 1];
				sz[j + 1] = sz[j];
				sz[j] = e;
			}
			a = sz[n - 1];
		}
		for (int k = 0;k < n - 1;k++)
		{
			if (sz[k] < sz[k + 1])
			{
				e = sz[k + 1];
				sz[k + 1] = sz[k];
				sz[k] = e;
			}
			b = sz[n - 1];
		}
		c = a - q;
		d = q - b;
		if (c > d)
		{
			System.out.printf("%d",a);
		}
		else if (c < d)
		{
			System.out.printf("%d",b);
		}
		else if (c == d)
		{
			System.out.printf("%d,%d",b,a);
		}
		return 0;
	}

}

