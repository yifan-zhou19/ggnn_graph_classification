package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] c = new int[2000];
	public static int s;
	public static int t;
	public static void input()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (s = 0;s < m;s++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[s] = Integer.parseInt(tempVar3);
			}
		}
		for (s = 0;s < n;s++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[s] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static void order()
	{
		int k;
		for (s = 1;s < m;s++)
		{
			for (t = 0;t < m - s;t++)
			{
				if (a[t] > a[t + 1])
				{
					k = a[t];
					a[t] = a[t + 1];
					a[t + 1] = k;
				}
			}
		}
		for (s = 1;s < n;s++)
		{
			for (t = 0;t < n - s;t++)
			{
				if (b[t] > b[t + 1])
				{
					k = b[t];
					b[t] = b[t + 1];
					b[t + 1] = k;
				}
			}
		}
	}

	public static void add()
	{
		for (s = 0;s < m;s++)
		{
			c[s] = a[s];
		}
		for (s = m,t = 0;s < m + n;s++,t++)
		{
			c[s] = b[t];
		}
	}

	public static void output()
	{
		for (s = 0;s < m + n;s++)
		{
			if (s != m + n - 1)
			{
				System.out.printf("%d ",c[s]);
			}
			else
			{
				System.out.printf("%d",c[s]);
			}
		}
	}

	public static int Main()
	{
		input();
		order();
		add();
		output();
		return 0;
	}
}

