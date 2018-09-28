package <missing>;

public class GlobalMembers
{
	public static int read()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		return 0;
	}
	public static void calculate()
	{
		int i;
		int j;
		for (i = 1;i < n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				a[i][j] = sqr((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
			}
		}
		return;
	}
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void sort();
	public static double sqr(double p)
	{
		double x1;
		double x2;
		x2 = p;
		x1 = 1.0;
		while (Math.abs(x2 - x1) > 1e-10)
		{
			x1 = x2;
			x2 = (x1 + p / x1) / 2;
		}
		return x2;
	}
	public static int print()
	{
		int i;
		int j;
		int k;
		int l;
		int p;
		double max;
		p = n * (n - 1) / 2;
		while (p > 0)
		{
			max = -1;
			for (i = 1;i < n;i++)
			{
				for (j = n;j > i;j--)
				{
					if (max < a[i][j])
					{
					max = a[i][j];
					 k = i;
					  l = j;
					}
					 else if (max == a[i][j])
					 {
						if (k > i)
						{
							k = i;
							l = j;
						}
						else if (k == i && l > j)
						{
							l = j;
						}
					 }
				}
			}
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[k],y[k],z[k],x[l],y[l],z[l],a[k][l]);
			a[k][l] = -100;
			p--;
		}
		return 0;
	}
	public static int[] x = new int[100];
	public static int[] y = new int[100];
	public static int[] z = new int[100];
	public static int n;
	public static double[][] a = new double[100][100];
	public static int Main()
	{
		read();
		calculate();
		print();
		return 0;
	}

}

