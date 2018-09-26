package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		double t;
		double[] d = new double[45];
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
				d[(j - i) + (n - 1 + n - i) * i / 2 - 1] = Math.sqrt((double)((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j])));
			}
		}
		for (i = 0;i < n * (n - 1) / 2 - 1;i++)
		{
			for (j = i + 1;j < n * (n - 1) / 2;j++)
			{
				if (d[i] < d[j])
				{
					t = d[i];
					d[i] = d[j];
					d[j] = t;
				}
			}
		}
		for (k = 0;k < n * (n - 1) / 2;k++)
		{
			if (d[k] != d[k + 1])
			{
				for (i = 0;i < n - 1;i++)
				{
					for (j = i + 1;j < n;j++)
					{
						if (Math.sqrt((double)((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]))) - d[k] == 0)
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
						  System.out.print((fixed));
						  System.out.printf("%.2d", d[k]);
						  System.out.printf("%.2d", '\n');
						}
					}
				}
			}
		}
		return 0;
	}

}

