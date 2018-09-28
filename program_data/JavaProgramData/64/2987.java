package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int[] x = new int[11];
		int[] y = new int[11];
		int[] z = new int[11];
		int[][] a = new int[51][3];
		double[] d = new double[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
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
		int cnt = 0;
		for (int i = 1;i <= n;i++)
		{
				for (int j = i + 1;j <= n;j++)
				{
						int c = ++cnt;
						d[c] = Math.sqrt(sqr(x[i] - x[j]) + sqr(y[i] - y[j]) + sqr(z[i] - z[j]));
						a[c][1] = i;
						a[c][2] = j;
				}
		}
		for (int i = 1;i <= cnt;i++)
		{
				for (int j = cnt;j > i;j--)
				{
						if (d[j - 1] < d[j])
						{
										double t1;
										int t2;
										int t3;
										t1 = d[j - 1];
										d[j - 1] = d[j];
										d[j] = t1;
										t2 = a[j - 1][1];
										t3 = a[j - 1][2];
										a[j - 1][1] = a[j][1];
										a[j - 1][2] = a[j][2];
										a[j][1] = t2;
										a[j][2] = t3;
						}
				}
		}
		for (int i = 1;i <= cnt;i++)
		{
				System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n", x[a[i][1]],y[a[i][1]],z[a[i][1]],x[a[i][2]],y[a[i][2]],z[a[i][2]],d[i]);
		}
		return 0;
	}




}

