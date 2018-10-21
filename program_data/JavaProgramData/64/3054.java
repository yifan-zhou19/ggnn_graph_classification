package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int t;
		int[] a = new int[150];
		int[] b = new int[150];
		int[] x = new int[11];
		int[] y = new int[11];
		int[] z = new int[11];
		double r;
		double[] c = new double[150];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
					x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		t = 0;
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
					t++;
					a[t] = i;
					b[t] = j;
					c[t] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
			}
		}

				for (i = 1;i <= t - 1;i++)
				{
					for (j = 1;j <= t - i;j++)
					{
						if (c[j + 1] > c[j])
						{
								k = a[j + 1];
								a[j + 1] = a[j];
								a[j] = k;
								k = b[j + 1];
								b[j + 1] = b[j];
								b[j] = k;
								r = c[j + 1];
								c[j + 1] = c[j];
								c[j] = r;
						}
					}
				}
	for (i = 1;i <= t;i++)
	{
	System.out.printf("%f", "(");
	System.out.printf("%f", x[a[i]]);
	System.out.printf("%f", ",");
	System.out.printf("%f", y[a[i]]);
	System.out.printf("%f", ",");
	System.out.printf("%f", z[a[i]]);
	System.out.printf("%f", ")-(");
	System.out.printf("%f", x[b[i]]);
	System.out.printf("%f", ",");
	System.out.printf("%f", y[b[i]]);
	System.out.printf("%f", ",");
	System.out.printf("%f", z[b[i]]);
	System.out.printf("%f", ")=");
	System.out.printf("%.2f", c[i]);
	System.out.printf("%.2f", "\n");
	}
	i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

