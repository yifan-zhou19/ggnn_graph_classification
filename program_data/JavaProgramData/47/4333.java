package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		e = 0;
		while (e < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[e] = Integer.parseInt(tempVar2);
			}
			e = e+1;
		}
		if (n % 2 == 0)
		{
			e = 0;
			k = n / 2;
			while (e < k)
			{
				i = sz[e];
				sz[e] = sz[n - e-1];
				sz[n - e-1] = i;
				e = e+1;
			}
			e = 0;
			while (e < n - 1)
			{
				System.out.printf("%d ",sz[e]);
				e = e+1;
			}
			System.out.printf("%d",sz[n - 1]);
		}
		else if (n % 2 == 1)
		{
			e = 0;
			k = n - 1;
			k = k / 2;
			while (e < k)
			{
				i = sz[e];
				sz[e] = sz[n - e-1];
				sz[n - e-1] = i;
				e = e+1;
			}
			e = 0;
			while (e < n - 1)
			{
				System.out.printf("%d ",sz[e]);
				e = e+1;
			}
			System.out.printf("%d",sz[n - 1]);
		}
		return 0;
	}

}

