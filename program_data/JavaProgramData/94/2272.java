package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[500];
		int[] zs = new int[500];
		int a;
		int b;
		int c;
		int d;
		int e;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		a = 0;
		for (i = 0;i <= n;i++)
		{
			if (sz[i] % 2 != 0)
			{
				zs[a] = sz[i];
				a++;
			}
		}
		for (i = 0,d = 0;i < a;i++)
		{
			if (zs[i] > d)
			{
				d = zs[i];
			}
		}
		for (c = 0;c < a - 1;c++)
		{
			for (i = 0,b = 10000;i < a;i++)
			{
				if (zs[i] < b)
				{
					b = zs[i];
					e = i;
				}
			}
			zs[e] = d;
			System.out.printf("%d,",b);
		}
		System.out.printf("%d",d);
		return 0;
	}

}

