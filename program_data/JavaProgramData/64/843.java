package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num = n * (n - 1) / 2;
		int[][] a = new int[10][3];
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < 3; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		double[][] b = new double[10][10];
		double[] c = new double[45];
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
					double len1;
					double len2;
					double len3;
					len1 = Math.pow(a[i][0] - a[j][0], 2.0);
					len2 = Math.pow(a[i][1] - a[j][1], 2.0);
					len3 = Math.pow(a[i][2] - a[j][2], 2.0);
					b[i][j] = Math.sqrt(len1 + len2 + len3);
					c[k++] = b[i][j];
			}
		}
		double temp;
		for (i = 0; i < num - 1; i++)
		{
			for (j = 0; j < num - 1 - i; j++)
			{
				if ((c[j] < c[j + 1]))
				{
					temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		}
		for (k = 0; k < num; k++)
		{
			if (k == 0)
			{
				for (i = 0; i < n; i++)
				{
					for (j = i + 1; j < n; j++)
					{
						if (Math.abs(b[i][j] - c[k]) < 1e-9)
						{
							System.out.printf("%f", "(");
							System.out.printf("%f", a[i][0]);
							System.out.printf("%f", ",");
							System.out.printf("%f", a[i][1]);
							System.out.printf("%f", ",");
							System.out.printf("%f", a[i][2]);
							System.out.printf("%f", ")");
							System.out.printf("%f", "-");
							System.out.printf("%f", "(");
							System.out.printf("%f", a[j][0]);
							System.out.printf("%f", ",");
							System.out.printf("%f", a[j][1]);
							System.out.printf("%f", ",");
							System.out.printf("%f", a[j][2]);
							System.out.printf("%f", ")");
							System.out.printf("%f", "=");
							System.out.printf("%.2f", b[i][j]);
							System.out.printf("%.2f", "\n");
						}
					}
				}
			}
			else
			{
				while (Math.abs(c[k] - c[k - 1]) < 1e-9)
				{
					k++;
				}
				for (i = 0; i < n; i++)
				{
					for (j = i + 1; j < n; j++)
					{
						if (Math.abs(b[i][j] - c[k]) < 1e-9)
						{
							System.out.printf("%.2f", "(");
							System.out.printf("%.2f", a[i][0]);
							System.out.printf("%.2f", ",");
							System.out.printf("%.2f", a[i][1]);
							System.out.printf("%.2f", ",");
							System.out.printf("%.2f", a[i][2]);
							System.out.printf("%.2f", ")");
							System.out.printf("%.2f", "-");
							System.out.printf("%.2f", "(");
							System.out.printf("%.2f", a[j][0]);
							System.out.printf("%.2f", ",");
							System.out.printf("%.2f", a[j][1]);
							System.out.printf("%.2f", ",");
							System.out.printf("%.2f", a[j][2]);
							System.out.printf("%.2f", ")");
							System.out.printf("%.2f", "=");
							System.out.printf("%.2f", b[i][j]);
							System.out.printf("%.2f", "\n");
						}
					}
				}
			}
		}
		return 0;
	}

}

