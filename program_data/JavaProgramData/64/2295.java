package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int j;
		int e;
		int k;
		int u;
		double[] s = new double[50];
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct result
	//	{
	//		   int x1,y1,z1,x2,y2,z2;
	//		   double s;
	//		}
	//		a[50],t;
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
		p = (n * (n - 1)) / 2;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
							e = (n - 1.0 * (i + 1) / 2) * i + j - i - 1;
				u = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]);
				s[e] = Math.sqrt(1.0 * u);
			}
		}

			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
				   e = (n - 1.0 * (i + 1) / 2) * i + j - i - 1;
				   a[e].x1 = x[i];
				   a[e].y1 = y[i];
				   a[e].z1 = z[i];
				   a[e].x2 = x[j];
				   a[e].y2 = y[j];
				   a[e].z2 = z[j];
				   a[e].s = s[e];
				}
			}
			for (k = 1;k <= p;k++)
			{
			   for (i = 0;i < p - k;i++)
			   {
				   if (a[i].s < a[i + 1].s)
				   {
					   t = a[i + 1];
					   a[i + 1] = a[i];
					   a[i] = t;
				   }
			   }
			}
			for (i = 0;i < p;i++)
			{
				   System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[i].x1,a[i].y1,a[i].z1,a[i].x2,a[i].y2,a[i].z2,a[i].s);

			}
		   return 0;
	}
}

