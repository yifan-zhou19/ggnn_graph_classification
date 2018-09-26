package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int i;
		int j;
		int n;
		int m = 1;
		int l;
		double[] d = new double[46];
		double p;
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
				d[m] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				m = m + 1;
			}
		}
		for (i = 1;i < m;i++)
		{
			for (j = 1;j <= m - i;j++)
			{
				if (d[j] < d[j + 1])
				{
					p = d[j];
					d[j] = d[j + 1];
					d[j + 1] = p;
				}
			}
		}
		for (i = m;i > 1;i--)
		{
			if (d[i] == d[i - 1])
			{
				d[i] = 0;
			}
		}

		for (l = 1;l <= m;l++)
		{
			if (d[l] != 0)
			{
				for (i = 0;i < n - 1;i++)
				{
				for (j = i;j < n;j++)
				{
					if (Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j])) == d[l])
					{
					System.out.print("(");
					System.out.print(x[i]);
					System.out.print(",");
					System.out.print(y[i]);
					System.out.print(",");
					System.out.print(z[i]);
					System.out.print(")-(");
					System.out.print(x[j]);
					System.out.print(",");
					System.out.print(y[j]);
					System.out.print(",");
					System.out.print(z[j]);
					System.out.print(")=");
					System.out.printf("%.2f", d[l]);
					System.out.printf("%.2f", "\n");
					}
				}
				}
			}
		}

				return 0;
	}

}

