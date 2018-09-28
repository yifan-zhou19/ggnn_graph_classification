package <missing>;

public class GlobalMembers
{
	public static double[] a = new double[10000];
	public static double[] g = new double[10000];
	public static void mppx(double[] a, int n)
	{
		int i;
		int j;
		double t;
		for (i = 0;i < n;i++)
		{
			g[i] = a[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = n - 2;j >= 0;j--)
			{
				if (g[j] < g[j + 1])
				{
					t = g[j];
					g[j] = g[j + 1];
					g[j + 1] = t;
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int v;
		int w;
		double d;
		double e;
		double f;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct b
	//	{
	//		double x,y,z;
	//	}
	//	c[1000];
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
				(c[i].x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(c[i].y) = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(c[i].z) = tempVar4;
			}
		}
		j = 0;
		k = 1;
		for (i = 0;i < (n - 1) * n / 2;i++)
		{
			d = (c[j].x - c[k].x) * (c[j].x - c[k].x);
			e = (c[j].y - c[k].y) * (c[j].y - c[k].y);
			f = (c[j].z - c[k].z) * (c[j].z - c[k].z);
			if (e < 0)
			{
				e = -e;
			}
			if (f < 0)
			{
				f = -f;
			}
			if (d < 0)
			{
				d = -d;
			}
			a[i] = d + e + f;
			a[i] = Math.sqrt(a[i]);
			k++;
			if (k == n)
			{
				j++;
				k = j + 1;
			}
		}
		mppx(a, n * (n - 1) / 2);
		l = 0;
		v = n - 1;
		for (i = 0;i < (n - 1) * n / 2;i++)
		{
			for (j = 0;j < (n - 1) * n / 2;j++)
			{
				if (a[j] == g[i])
				{
					for (w = j;w >= v;j = j)
					{
						if (w >= v)
						{
							l++;
							w = w - v + l;
						}
					}
					System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",(int)(c[l].x),(int)(c[l].y),(int)(c[l].z),(int)(c[w + 1].x),(int)(c[w + 1].y),(int)(c[w + 1].z),g[i]);
					a[j] = 0;
					l = 0;
					break;
				}
			}
		}
		return 0;
	}
}

