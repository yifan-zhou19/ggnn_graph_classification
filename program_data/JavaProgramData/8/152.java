package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] c = new int[1000];
	public static void du()
	{
		int i;
		for (i = 0;i < m;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
	}
	public static void pai()
	{
		int j;
		int k;
		int l;
	for (j = 0;j <= m;j++)
	{
		for (k = 0;k < m - 1;k++)
		{
			if (a[k] > a[k + 1])
			{
				l = a[k];
				a[k] = a[k + 1];
				a[k + 1] = l;
			}
		}
	}
	for (j = 0;j <= n;j++)
	{
		for (k = 0;k < n - 1;k++)
		{
			if (b[k] > b[k + 1])
			{
				l = b[k];
				b[k] = b[k + 1];
				b[k + 1] = l;
			}
		}
	}
	}
	public static void he()
	{
		int o;
		int p;
		for (o = 0;o < m;o++)
		{
			c[o] = a[o];
		}
		for (p = 0;p < n;p++)
		{
			c[o] = b[p];
			o++;
		}
	}
	public static void shu()
	{
		int q;
		for (q = 0;q < m + n;q++)
		{
			System.out.printf("%d",c[q]);
			if (q != m + n - 1)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("\n");
			}
		}
	}
	public static int Main()
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
		du();
		pai();
		he();
		shu();
		return 0;
	}

}

