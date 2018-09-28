package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p = 0;
		int[][] x = new int[11][3];
		int[][] y = new int[100][3];
		int[][] z = new int[100][3];
		double[] d1 = new double[45];
		double[] d = new double[45];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
			x[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < n - 1;i++)
		{
				for (j = i + 1;j < n;j++)
				{
					for (k = 0;k < 3;k++)
					{
						d1[p] = d1[p] + ((double)x[i][k] - (double)x[j][k]) * ((double)x[i][k] - (double)x[j][k]);
						y[p][k] = x[i][k];
						z[p][k] = x[j][k];
					}

					d[p] = Math.sqrt(d1[p]);
					p++;
				}
		}
		for (i = 0;i < p - 1;i++)
		{
				for (j = p - 2;j >= i;j--)
				{
			if (d[j] < d[j + 1])
			{
			swap(d[j],d[j + 1]);
			swap(y[j][0],y[j + 1][0]);
			swap(y[j][1],y[j + 1][1]);
			swap(y[j][2],y[j + 1][2]);
			swap(z[j][0],z[j + 1][0]);
			swap(z[j][1],z[j + 1][1]);
			swap(z[j][2],z[j + 1][2]);
			}
				}
		}
		for (i = 0;i < p;i++)
		{
			System.out.print("(");
			System.out.print(y[i][0]);
			System.out.print(",");
			System.out.print(y[i][1]);
			System.out.print(",");
			System.out.print(y[i][2]);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(z[i][0]);
			System.out.print(",");
			System.out.print(z[i][1]);
			System.out.print(",");
			System.out.print(z[i][2]);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", d[i]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}



}

