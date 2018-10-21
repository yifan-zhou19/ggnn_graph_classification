package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][4];
		int[][] m = new int[45][4];
		int[][] n = new int[45][4];
		int i = 0;
		int j = 0;
		int k = 0;
		int p;
		int q;
		int w;
		double[][] b = new double[10][10];
		double[] c = new double[45];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 0;i < w;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][2] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][3] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < w;i++)
		{
			for (j = i + 1;j < w;j++)
			{
				b[i][j] = (double)Math.sqrt((a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]) + (a[i][3] - a[j][3]) * (a[i][3] - a[j][3]));
			}
		}
		for (k = 0;k < w * (w - 1) / 2;k++)
		{
			c[k] = b[0][1];
			p = 0;
			q = 1;
			for (i = 0;i < w - 1;i++)
			{
				for (j = i + 1;j < w;j++)
				{
					if (c[k] < b[i][j])
					{
						c[k] = b[i][j];
						p = i;
						q = j;
					}
				}
			}
			b[p][q] = -1;
			m[k][1] = a[p][1];
			m[k][2] = a[p][2];
			m[k][3] = a[p][3];
			n[k][1] = a[q][1];
			n[k][2] = a[q][2];
			n[k][3] = a[q][3];
		}
		for (k = 0;k < w * (w - 1) / 2;k++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",m[k][1],m[k][2],m[k][3],n[k][1],n[k][2],n[k][3],c[k]);
		}
	return 0;
	}
}

