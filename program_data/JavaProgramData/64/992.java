package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[11];
		int[] y = new int[11];
		int[] z = new int[11];
		int g = 0;
		int e1;
		int e2;
		double[][] d = new double[11][11];
		double m;
		int[][] max = new int[45][2];
		int i;
		int j;
		int k;
		int n;
		int e;
		int a;
		int s;
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
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				d[i][j] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				g = g + 1;
			}
		}
		for (k = 0;k < g;k++)
		{
			max[k][0] = 0;
			max[k][1] = 0;
		}
		for (k = 0;k < g;k++)
		{
			s = k + 1;
			for (a = 0;a < n;a++)
			{
				s = s - n + a + 1;
				if (s <= 0)
				{
				   s = s + n - a - 1;
				   break;
				}
			}
			max[k][0] = a;
			max[k][1] = s + a;
		}
		for (k = 0;k < g;k++)
		{
			for (e = g - 1;e >= k;e--)
			{
				if (e < g - 1)
				{
					 if (d[max[e][0]][max[e][1]] < d[max[e+1][0]][max[e+1][1]])
					 {
						e1 = max[e][0];
						max[e][0] = max[e+1][0];
						max[e+1][0] = e1;
						e2 = max[e][1];
						max[e][1] = max[e+1][1];
						max[e+1][1] = e2;
					 }
				}
			}
		}
		for (k = 0;k < g;k++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[max[k][0]],y[max[k][0]],z[max[k][0]],x[max[k][1]],y[max[k][1]],z[max[k][1]],d[max[k][0]][max[k][1]]);
		}
		return 0;
	}



}

