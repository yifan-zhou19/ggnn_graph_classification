package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int p = 0;
		int f;
		int[] c = new int[100];
		int[] d = new int[100];
		int[][] a = new int[100][50];
		double[] b = new double[200];
		double q;
		double e;
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
							a[i][0] = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							a[i][1] = Integer.parseInt(tempVar3);
						}
						String tempVar4 = ConsoleInput.scanfRead();
						if (tempVar4 != null)
						{
							a[i][2] = Integer.parseInt(tempVar4);
						}
		}
		for (i = 0;i < n;i++)
		{
						for (k = i + 1;k < n;k++)
						{
										  q = (a[i][0] - a[k][0]) * (a[i][0] - a[k][0]) + (a[i][1] - a[k][1]) * (a[i][1] - a[k][1]) + (a[i][2] - a[k][2]) * (a[i][2] - a[k][2]);
										  b[p] = Math.sqrt(q);
										  c[p] = i;
										  d[p] = k;
										  p++;
						}
		}
		for (i = 1;i <= p;i++)
		{
						for (k = 0;k < p - i;k++)
						{
										  if (b[k + 1] > b[k])
										  {
														 e = b[k + 1];
														 b[k + 1] = b[k];
														 b[k] = e;
														 f = c[k + 1];
														 c[k + 1] = c[k];
														 c[k] = f;
														 f = d[k + 1];
														 d[k + 1] = d[k];
														 d[k] = f;
										  }
						}
		}
		for (i = 0;i < p;i++)
		{
						System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[c[i]][0],a[c[i]][1],a[c[i]][2],a[d[i]][0],a[d[i]][1],a[d[i]][2],b[i]);
		}
		return 0;
	}
}

