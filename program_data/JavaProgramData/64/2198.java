package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] x = new int[n];
		int[] y = new int[n];
		int[] z = new int[n];
		int p;
		int q;
		float[][] d = new float[n][n - 1];
		float t;
		float[] a = new float[n * (n - 1) / 2];
		int k = 0;
		int[] b = new int[n * (n - 1) / 2];
		int[] c = new int[n * (n - 1) / 2];
		for (int i = 0;i < n;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (int i = 0;i < n;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				d[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				a[k] = d[i][j];
				b[k] = i;
				c[k] = j;
				k++;

			}
		}
		for (int i = 1;i < n * (n - 1) / 2;i++)
		{
			for (int j = 0;j < n * (n - 1) / 2 - i;j++)
			{
				if (a[j] < a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
					p = b[j];
									b[j] = b[j + 1];
									b[j + 1] = p;
									q = c[j];
													c[j] = c[j + 1];
													c[j + 1] = q;
				}
			}
		}
		for (int i = 0;i < k;i++)
		{
			System.out.print("(");
			System.out.print(x[b[i]]);
			System.out.print(",");
			System.out.print(y[b[i]]);
			System.out.print(",");
			System.out.print(z[b[i]]);
			System.out.print(")-");
			System.out.print("(");
			System.out.print(x[c[i]]);
			System.out.print(",");
			System.out.print(y[c[i]]);
			System.out.print(",");
			System.out.print(z[c[i]]);
			System.out.print(")=");
			System.out.printf("%.2f", a[i]);
			System.out.printf("%.2f", "\n");
		}

	return 0;


	}
}

