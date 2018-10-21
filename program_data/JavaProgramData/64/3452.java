package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int e = 0;
		int m = -1;
		int q = -1;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double t;
		double g;
		double f;
		double r;
		double v;
		double s;
		double o;
		double[] d = new double[100];
		double[] p = new double[100];
		double[] w = new double[100];
		double[] k = new double[100];
		double[] z = new double[100];
		double[] l = new double[100];
		double[] u = new double[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		   a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   c[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			d[i] = 0;
		}
		e = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
					d[e] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]) + (c[i] - c[j]) * (c[i] - c[j]));
				  p[e] = a[i];
				  w[e] = a[j];
				   u[e] = b[i];
				  l[e] = b[j];
				  k[e] = c[i];
				  z[e] = c[j];
				 e++;
			}
		}
		for (i = 0;i < (n * (n - 1) / 2) - 1;i++)
		{
			for (j = 0;j < (n * (n - 1) / 2) - i - 1;j++)
			{
				if (d[j] < d[j + 1])
				{
						t = d[j];
					d[j] = d[j + 1];
					d[j + 1] = t;
				   g = p[j];
					p[j] = p[j + 1];
					p[j + 1] = g;
				   f = w[j];
					w[j] = w[j + 1];
					w[j + 1] = f;
				   r = u[j];
					u[j] = u[j + 1];
					u[j + 1] = r;
				   v = l[j];
				   l[j] = l[j + 1];
					l[j + 1] = v;
				   s = k[j];
					k[j] = k[j + 1];
					k[j + 1] = s;
				  o = z[j];
					z[j] = z[j + 1];
					z[j + 1] = o;
				}
			}
		}
				for (i = 0;i < (n * (n - 1) / 2);i++)
				{
					System.out.print("(");
					System.out.print(p[i]);
					System.out.print(",");
					System.out.print(u[i]);
					System.out.print(",");
					System.out.print(k[i]);
					System.out.print(")");
					System.out.print("-");
					System.out.print("(");
					System.out.print(w[i]);
					System.out.print(",");
					System.out.print(l[i]);
					System.out.print(",");
					System.out.print(z[i]);
					System.out.print(")");
					System.out.print("=");
				System.out.printf("%.2f\n",d[i]);

				}
	}

}

