package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int e;
		int i;
		int j;
		int m;
		int n;
		int[] f = new int[num];
		int[] g = new int[num];
		m = 2;
		a = 10000;
		b = 0;
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
				(f[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(g[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (f[i] < a)
			{
				a = f[i];
			}
			if (g[i] < a)
			{
				a = g[i];
			}
			if (f[i] > b)
			{
				b = f[i];
			}
			if (g[i] > b)
			{
				b = g[i];
			}
		}
		for (j = n - 1;j > 0;j--)
		{
			for (i = 0;i < j;i++)
			{
				if (f[i] > f[i + 1])
				{
					e = f[i];
					f[i] = f[i + 1];
					f[i + 1] = e;
					e = g[i];
					g[i] = g[i + 1];
					g[i + 1] = e;
				}
			}
		}
		e = 0;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (f[i] > g[j])
				{
					e++;
				}
			}
			if (i == e)
			{
				m = 3;
				break;
			}
			else
			{
				e = 0;
			}
		}
		if (m == 2)
		{
		System.out.printf("%d %d",a,b);
		}
		else
		{
			System.out.print("no");
		}
	   return 0;
	}
}

