package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int n;
		int i;
		int j;
		int p;
		int m;
		int h;
		double k;
		double[][] l = new double[10][10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				k = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]);
					l[i][j] = Math.sqrt(k);
			}
		}
		for (h = 1;h <= n * (n - 1) / 2;h++)
		{
			double max = 0;
			for (i = 0;i < n - 1;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (max < l[i][j])
					{
						max = l[i][j];
						p = i,m = j;
					}
				}
			}
			System.out.print("(");
			System.out.print(x[p]);
			System.out.print(",");
			System.out.print(y[p]);
			System.out.print(",");
			System.out.print(z[p]);
			System.out.print(")-(");
			System.out.print(x[m]);
			System.out.print(",");
			System.out.print(y[m]);
			System.out.print(",");
			System.out.print(z[m]);
			System.out.print(")=");
			System.out.printf("%.2f", l[p][m]);
			System.out.printf("%.2f", "\n");
			l[p][m] = 0;
		}
		return 0;
	}
}

