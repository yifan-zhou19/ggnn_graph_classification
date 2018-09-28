package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		double[] x = new double[10];
		double[] y = new double[10];
		double[] z = new double[10];
		double[] d = new double[100];
		double t;
		double s;
		double[][] c = new double[10][10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			z[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				d[k] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				k++;
			}
		}
		for (int k = 0;k < (n * (n - 1) / 2) - 1;k++)
		{
		for (int l = 0;l < (n * (n - 1) / 2) - 1;l++)
		{
			if (d[l] < d[l + 1])
			{
				t = d[l + 1];
				d[l + 1] = d[l];
				d[l] = t;
			}
		}
		}
		for (int k = 0;k < (n * (n - 1) / 2);k++)
		{
			s = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				if (d[k] == Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j])) && s == 0 && c[i][j] == 0)
				{
					System.out.print("(");
					System.out.printf("%f", x[i]);
					System.out.printf("%f", ",");
					System.out.printf("%f", y[i]);
					System.out.printf("%f", ",");
					System.out.printf("%f", z[i]);
					System.out.printf("%f", ")-(");
					System.out.printf("%f", x[j]);
					System.out.printf("%f", ",");
					System.out.printf("%f", y[j]);
					System.out.printf("%f", ",");
					System.out.printf("%f", z[j]);
					System.out.printf("%f", ")=");
					System.out.printf("%.2f", d[k]);
					System.out.printf("%.2f", "\n");
					s += 1;
					c[i][j] += 1;
				}
			}
		}
		}
		return 0;
	}
}

