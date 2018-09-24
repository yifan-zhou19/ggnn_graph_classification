package <missing>;

public class GlobalMembers
{
	public static void a(int m)
	{
		int i;
		int n;
		for (i = 0;i < 15;i++)
		{
			x[i] = 0;
		}
		for (i = 0;i < 15;i++)
		{
			if (m < sqrt(i))
			{
				n = i;
				break;
			}
		}
		x[n - 1] = o;
		for (i = n - 2;i >= 0;i--)
		{
			if (m % 2 == 0)
			{
				x[i] = m / 2;
				m = m / 2;
				continue;
			}
			if (m % 2 == 1)
			{
				x[i] = (m - 1) / 2;
				m = (m - 1) / 2;
				continue;
			}
		}
	}
	public static void b(int m)
	{
		int i;
		int n;
		for (i = 0;i < 15;i++)
		{
			y[i] = 0;
		}
		for (i = 0;i < 15;i++)
		{
			if (m < sqrt(i))
			{
				n = i;
				break;
			}
		}
		y[n - 1] = p;
		for (i = n - 2;i >= 0;i--)
		{
			if (m % 2 == 0)
			{
				y[i] = m / 2;
				m = m / 2;
				continue;
			}
			if (m % 2 == 1)
			{
				y[i] = (m - 1) / 2;
				m = (m - 1) / 2;
				continue;
			}
		}
	}
	public static int sqrt(int i)
	{
		int m = 1;
		int j;
		for (j = 1;j <= i;j++)
		{
			m = m * 2;
		}
		return m;
	}
	public static int c()
	{
		int i;
		int k = 1;
		for (i = 0;i < 15;i++)
		{
			if (x[i] == y[i])
			{
				k = i;
			}
			if (x[i] != y[i] || x[i] == 0)
			{
				break;
			}
		}
		return x[k];
	}
	public static int[] x = new int[15];
	public static int[] y = new int[15];
	public static int o;
	public static int p;
	public static int Main()
	{
		int m;
		int n;
		int k;
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
		if (m == n)
		{
			System.out.printf("%d\n",n);
			return 0;
		}
		o = m;
		p = n;
		if (m == 1 || n == 1)
		{
			System.out.print("1\n");
			return 0;
		}
		a(m);
		b(n);
		System.out.printf("%d\n",c());
		return 0;
	}
}

