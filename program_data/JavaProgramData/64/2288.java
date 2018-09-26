package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][3];
		int n;
		int m;
		int l = 1;
		int i;
		int j;
		double[][] b = new double[3000][3];
		double q;
		double w;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n * (n - 1) / 2;
		for (i = 1;i <= n;i++)
		{
		  for (j = 1;j <= 3;j++)
		  {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
		  }
		}
		for (i = 1;i <= n;i++)
		{
			 for (j = i + 1;j <= n;j++)
			 {
					 b[l][1] = i;
					 b[l][2] = j;
					 b[l][3] = Math.sqrt((double)((a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]) + (a[i][3] - a[j][3]) * (a[i][3] - a[j][3])));
					 l++;
			 }
		}
		for (i = 1;i <= m;i++)
		{
				for (j = 1;j <= m - i;j++)
				{
						if (b[j][3] < b[j + 1][3])
						{
							 q = b[j][1];
							 w = b[j][2];
							 e = b[j][3];
							 b[j][1] = b[j + 1][1];
							 b[j][2] = b[j + 1][2];
							 b[j][3] = b[j + 1][3];
							 b[j + 1][1] = q;
							 b[j + 1][2] = w;
							 b[j + 1][3] = e;
						}
				}
		}
		for (i = 1;i <= m;i++)
		{
				System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n", a[(int)b[i][1]][1],a[(int)b[i][1]][2],a[(int)b[i][1]][3], a[(int)b[i][2]][1],a[(int)b[i][2]][2],a[(int)b[i][2]][3], b[i][3]);
		}
				return 0;
	}
}

