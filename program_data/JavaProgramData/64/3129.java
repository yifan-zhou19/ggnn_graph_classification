package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[] x = new double[11];
		double[] y = new double[11];
		double[] z = new double[11];
		double[][] s = new double[11][11];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			z[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}

		for (int i = 1; i <= n; i++)
		{
			for (int j = i + 1; j <= n; j++)
			{
				s[i][j] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]);
				s[i][j] = Math.sqrt(s[i][j]);
			}
		}

		for (int k = 1; k <= n * (n - 1) / 2; k++)
		{
			double max = 0;
			int t1 = 0;
			int t2 = 0;
			for (int i = 1; i <= n; i++)
			{
				for (int j = i + 1; j <= n; j++)
				{
					if (s[i][j] > max)
					{
	//					cout << i<<"   "<<j<<"  :  "<<s[i][j] << " &   "<<max <<endl;
						max = s[i][j];
						t1 = i;
						t2 = j;
					}
				}
			}
			System.out.print("(");
			System.out.print(x[t1]);
			System.out.print(",");
			System.out.print(y[t1]);
			System.out.print(",");
			System.out.print(z[t1]);
			System.out.print(")-(");
			System.out.print(x[t2]);
			System.out.print(",");
			System.out.print(y[t2]);
			System.out.print(",");
			System.out.print(z[t2]);
			System.out.print(")=");
			System.out.printf("%.2lf\n", s[t1][t2]);
			s[t1][t2] = 0;

		}
		return 0;
	}
}

