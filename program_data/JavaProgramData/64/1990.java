package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int m;
		int a;
		int b;
		int[] x = new int[12];
		int[] y = new int[12];
		int[] z = new int[12];
		double[][] d = new double[12][12];
		double max;
		int[][] pm = new int[12][12];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i <= n; i++)
		{
			for (j = i + 1; j <= n; j++)
			{
				d[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
			}
		}
		max = -1.0;
		k = n * (n - 1) / 2;
		for (l = 1; l <= k; l++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = i + 1; j <= n; j++)
				{
					if (d[i][j] - max > 1e-10)
					{
						max = d[i][j];
						a = i;
						b = j;
					}
				}
			}
			System.out.print("(");
			System.out.print(x[a]);
			System.out.print(",");
			System.out.print(y[a]);
			System.out.print(",");
			System.out.print(z[a]);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(x[b]);
			System.out.print(",");
			System.out.print(y[b]);
			System.out.print(",");
			System.out.print(z[b]);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", d[a][b]);
			System.out.printf("%.2f", "\n");
			d[a][b] = 0;
			max = - 1;
		}
		return 0;
	}
}

