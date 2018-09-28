package <missing>;

public class GlobalMembers
{
	public static int[] q = new int[100];
	public static int[] w = new int[100];
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static int k;
	public static int v;
	public static int y = 0;
	public static void a()
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
				q[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				w[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void b()
	{
		for (j = 0;j < m - 1;j++)
		{
			for (k = j + 1;k < m;k++)
			{
				if (q[j] > q[k])
				{
					v = q[k];
					q[k] = q[j];
					q[j] = v;
				}
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (k = j + 1;k < n;k++)
			{
				if (w[j] > w[k])
				{
					v = w[k];
					w[k] = w[j];
					w[j] = v;
				}
			}
		}
	}
	public static void c()
	{
		for (i = m;i < m + n;i++)
		{
			q[i] = w[y++];
		}
	}
	public static void d()
	{
		System.out.printf("%d",q[0]);
		for (i = 1;i < m + n;i++)
		{
			System.out.printf(" %d",q[i]);
		}
	}
	public static int Main()
	{
		a();
		b();
		c();
		d();
	}
}

