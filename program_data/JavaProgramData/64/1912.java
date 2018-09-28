package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct pointlong
	//  {
	//	int a1;
	//	int b1;
	//	int c1;
	//	int a2;
	//	int b2;
	//	int c2;
	//	double sl;
	//  };
		pointlong[] point = tangible.Arrays.initializeWithDefaultpointlongInstances(10000);
		int[] x = new int[11];
		int[] y = new int[11];
		int[] z = new int[11];
		double[][] a = new double[11][11];
		double[] c = new double[1000];
		int i;
		int j;
		int n;
		int k;
		int p;
		int sum;
		int w;
		int f;
		float m;
		double temp;
		k = 0;
		w = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		sum = n * (n - 1) / 2;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				m = (float)(x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]);
				a[i][j] = Math.sqrt(m);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				c[k] = a[i][j];
				k = k + 1;
			}
		}
		for (i = 1;i < sum;i++)
		{
			for (j = 0;j < sum;j++)
			{
				if (c[j] < c[j + 1])
				{
					temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		}
		for (i = 0;i <= sum;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (p = j + 1;p < n;p++)
				{
					if (a[j][p] == c[i])
					{
						point[w].a1 = x[j];
						point[w].b1 = y[j];
						point[w].c1 = z[j];
						point[w].a2 = x[p];
						point[w].b2 = y[p];
						point[w].c2 = z[p];
						point[w].sl = c[i];
						w = w + 1;

					}
				}
			}
		}
		for (i = 0;i < w;i++)
		{
			 f = 0;
			for (j = 0;j < i;j++)
			{
				if (point[i].a1 == point[j].a1 && point[i].b1 == point[j].b1 && point[i].c1 == point[j].c1 && point[i].sl == point[j].sl && point[i].a2 == point[j].a2 && point[i].b2 == point[j].b2 && point[i].c2 == point[j].c2)
				{
					f = 1;
					break;
				}
			}
			if (f == 0)
			{


			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",point[i].a1,point[i].b1,point[i].c1,point[i].a2,point[i].b2,point[i].c2,point[i].sl);
			}
		}
		return 0;
	}

}

