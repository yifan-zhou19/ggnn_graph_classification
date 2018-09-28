package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] x = new int[500];
		int s;
		int t;
		int[] y = new int[500];
		int k;
		int m;
		k = 0;
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
				x[i] = Integer.parseInt(tempVar2);
			}
			s = x[i] % 2;
			if (s == 1)
			{
				y[k] = x[i];
				k = k + 1;
			}
		}
		for (t = 0;t < k;t++)
		{
			for (i = k - 1;i > t;i--)
			{
				if (y[i] < y[i - 1])
				{
					m = y[i];
					y[i] = y[i - 1];
					y[i - 1] = m;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",y[i]);
		}
		System.out.printf("%d",y[k - 1]);
		return 0;
	}

}

