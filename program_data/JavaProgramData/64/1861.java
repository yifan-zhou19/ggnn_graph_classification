package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[10][3];
		int[][] b = new int[100][3];
		int[][] c = new int[100][3];
		int k = 0;
		int[] e = new int[100];
		double[] d = new double[100];
		double[] l = new double[100];
		double x = 0;
		double[] m = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(a[i][j]) = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[k] = Math.sqrt(1.0 * ((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2])));
				b[k][0] = a[i][0];
				b[k][1] = a[i][1];
				b[k][2] = a[i][2];
				c[k][0] = a[j][0];
				c[k][1] = a[j][1];
				c[k][2] = a[j][2];
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			l[i] = d[i];
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k;j++)
			{
				if (l[j] > x)
				{
					x = l[j];
					e[i] = j;
				}
			}
			l[e[i]] = 0;
			x = 0;
		}
		for (i = 0;i < k;i++)
		{
			m[i] = d[e[i]];
		}



		for (i = 0;i < k;i++)
		{
			 System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",b[e[i]][0],b[e[i]][1],b[e[i]][2],c[e[i]][0],c[e[i]][1],c[e[i]][2],m[i]);
		}

		return 0;
	}
}

