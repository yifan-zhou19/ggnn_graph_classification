package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		int r;
		int t;
		double s;
		int[] x = new int[11];
		int[] y = new int[11];
		int[] z = new int[11];
		for (i = 1;i <= n;i++)
		{

			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		double[] w = new double[100];
		int[] p = new int[100];
		int[] q = new int[100];
		i = 1;
		int d = n * (n - 1) / 2;
		for (j = 1;j < n;j++)
		{
				for (k = j + 1;k <= n;k++)
				{
				   w[i] = Math.sqrt(Math.pow((x[j] - x[k]),2.0) + Math.pow((y[j] - y[k]),2.0) + Math.pow((z[j] - z[k]),2.0));
				   p[i] = j;
				   q[i] = k;
				   i++;

				}
		}
		for (j = 1;j < d;j++)
		{
			for (i = 1;i <= d - j;i++)
			{
			if (w[i] < w[i + 1])
			{
				s = w[i];
				w[i] = w[i + 1];
				w[i + 1] = s;
				r = p[i];
				p[i] = p[i + 1];
				p[i + 1] = r;
				t = q[i];
				q[i] = q[i + 1];
				q[i + 1] = t;

			}
			}

		}
		for (i = 1;i <= d;i++)
		{
			System.out.print("(");
			System.out.print(x[p[i]]);
			System.out.print(",");
			System.out.print(y[p[i]]);
			System.out.print(",");
			System.out.print(z[p[i]]);
			System.out.print(")-");
			System.out.print("(");
			System.out.print(x[q[i]]);
			System.out.print(",");
			System.out.print(y[q[i]]);
			System.out.print(",");
			System.out.print(z[q[i]]);
			System.out.print(")=");
			System.out.printf("%.2f", w[i]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}

}

