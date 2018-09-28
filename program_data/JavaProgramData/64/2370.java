package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int f;
		k = 0;
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int[][] m = new int[50][6];
		double[] r = new double[50];
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
			for (j = n - 1;j > i;j--)
			{
				r[k] = Math.sqrt(1.0 * ((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j])));
				m[k][0] = x[i];
				m[k][1] = y[i];
				m[k][2] = z[i];
				m[k][3] = x[j];
				m[k][4] = y[j];
				m[k][5] = z[j];
				k++;
			}
		}
		for (i = 1;i <= n * (n - 1) / 2;i++)
		{
			for (j = 0;j < n * (n - 1) / 2 - i;j++)
			{
				if (r[j] >= r[j + 1])
				{
				   e = r[j + 1];
				   r[j + 1] = r[j];
				   r[j] = e;
				   f = m[j + 1][0];
				   m[j + 1][0] = m[j][0];
				   m[j][0] = f;
				   f = m[j + 1][1];
				   m[j + 1][1] = m[j][1];
				   m[j][1] = f;
				   f = m[j + 1][2];
				   m[j + 1][2] = m[j][2];
				   m[j][2] = f;
				   f = m[j + 1][3];
				   m[j + 1][3] = m[j][3];
				   m[j][3] = f;
				   f = m[j + 1][4];
				   m[j + 1][4] = m[j][4];
				   m[j][4] = f;
				   f = m[j + 1][5];
				   m[j + 1][5] = m[j][5];
				   m[j][5] = f;
				}
			}
		}
		for (i = n * (n - 1) / 2 - 1;i >= 0;i--)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",m[i][0],m[i][1],m[i][2],m[i][3],m[i][4],m[i][5],r[i]);
		}
		return 0;
	}
}

