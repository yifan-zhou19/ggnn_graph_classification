package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] c = new int[2000];
	public static int s;
	public static int t;
	public static void one()
	{
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
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static void two()
	{
		for (j = 0;j < m - 1;j++)
		{
			for (i = 0;i < m - 1 - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					s = a[i];
					a[i] = a[i + 1];
					a[i + 1] = s;
				}
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (b[i] > b[i + 1])
				{
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
				}
			}
		}
	}
	public static void three()
	{
		for (i = 0;i < m;i++)
		{
			c[i] = a[i];
		}
		for (i = m;i - m < n;i++)
		{
			c[i] = b[i - m];
		}
	}
	public static void four()
	{
		System.out.printf("%d",c[0]);
		for (i = 1;i < m + n;i++)
		{
		System.out.printf(" %d",c[i]);
		}
	}
	public static void Main()
	{
		one();
		two();
		three();
		four();
	}
}

