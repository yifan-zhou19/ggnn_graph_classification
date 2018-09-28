package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int i1;
		int j1;
		int k;
		double[] x = new double[11]; //?i????j??????r[i][j],?i??????(x[i],y[i],z[i])
		double[] y = new double[11];
		double[] z = new double[11];
		double[][] r = new double[10][11];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			z[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i < n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				r[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
			}
		} //?????????
		double max = 0; //?max?????????
		for (k = 1;k <= 100;k++)
		{
		for (i = 1;i < n;i++)
		{
			for (j = i;j <= n;j++)
			{
				if (r[i][j] > max)
				{
					max = r[i][j];
					i1 = i;
					j1 = j; //????????????
				}
			}
		}
		if (max != 0)
		{
				System.out.printf("%f", "(");
				System.out.printf("%f", x[i1]);
				System.out.printf("%f", ",");
				System.out.printf("%f", y[i1]);
				System.out.printf("%f", ",");
				System.out.printf("%f", z[i1]);
				System.out.printf("%f", ")-(");
				System.out.printf("%f", x[j1]);
				System.out.printf("%f", ",");
				System.out.printf("%f", y[j1]);
				System.out.printf("%f", ",");
				System.out.printf("%f", z[j1]);
				System.out.printf("%f", ")=");
				System.out.printf("%.2f", r[i1][j1]);
				System.out.printf("%.2f", "\n");
				r[i1][j1] = 0; //???????
				max = 0;
		}
		}
		return 0;
	}
}

