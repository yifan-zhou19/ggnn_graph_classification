package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
			int i;
			int j;
			int k;
			int b;
			int c;
			int[] x = new int[10];
			int[] y = new int[10];
			int[] z = new int[10];
			double[][] m = new double[10][10];
			double max = 0;
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
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n;j++)
				{
					m[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				}
			}
			for (k = 0;k < n * (n - 1) / 2;k++)
			{
				for (i = 0;i < n - 1;i++)
				{
				for (j = i + 1;j < n;j++)
				{
					if (max < m[i][j])
					{
					   max = m[i][j];
					   b = i;
					   c = j;
					}
				}
				}
			if (max == 0)
			{
				break;
			}
			else
			{
				System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[b],y[b],z[b],x[c],y[c],z[c],max);
				m[b][c] = 0;
				max = 0;
			}
			}
		 return 0;
	}

}

