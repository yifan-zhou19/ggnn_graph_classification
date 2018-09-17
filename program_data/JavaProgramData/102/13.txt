package <missing>;

public class GlobalMembers
{
	//int a[10000];
	public static char[][] b = new char[10000][100];
	public static double[] m = new double[10000];
	public static double[] f = new double[10000];
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int p = 0;
		int q = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = tempVar2.charAt(0);
			}
		//	scanf("%lf",&c[i]);
			if (b[i][0] == 'm')
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					m[p] = Double.parseDouble(tempVar3);
				}
				p++;
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					f[q] = Double.parseDouble(tempVar4);
				}
				q++;
			}
		}
		int x;
		int y;
		int k;
		double e;
		for (k = 0;k <= p;k++)
		{
			for (x = 0;x < p - 1;x++)
			{
			if (m[x] > m[x + 1])
			{
				e = m[x];
				m[x] = m[x + 1];
				m[x + 1] = e;
			}
			}
		}
		for (k = 0;k <= q;k++)
		{
			for (y = 0;y < q - 1;y++)
			{
			if (f[y] < f[y + 1])
			{
				e = f[y];
				f[y] = f[y + 1];
				f[y + 1] = e;
			}
			}
		}
		System.out.printf("%.2lf",m[0]);
		for (x = 1;x < p;x++)
		{

		System.out.printf(" %.2lf",m[x]);
		}
		for (y = 0;y < q;y++)
		{

		System.out.printf(" %.2lf",f[y]);
		}
		return 0;
	}

}

