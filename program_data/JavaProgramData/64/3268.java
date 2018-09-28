package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int l;
		double[][] a = new double[102][4];
		double[][] b = new double[102][102];
		double[] c = new double[2000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= 3;j++)
			{
				a[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				b[i][j] = Math.sqrt((a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]) + (a[i][3] - a[j][3]) * (a[i][3] - a[j][3]));
				c[k] = b[i][j];
				k++;
			}
		}
		sort(c,c + n * (n - 1) / 2);
		for (k = n * (n - 1) / 2 - 1;k >= 0;k--)
		{
			if (c[k + 1] == c[k])
			{
				continue;
			}
		for (i = 1;i <= n - 1;i++)
		{
				for (j = i + 1;j <= n;j++)
				{

						if (b[i][j] == c[k])
						{
							System.out.print("(");
							System.out.print(a[i][1]);
							System.out.print(",");
							System.out.print(a[i][2]);
							System.out.print(",");
							System.out.print(a[i][3]);
							System.out.print(")-(");
							System.out.print(a[j][1]);
							System.out.print(",");
							System.out.print(a[j][2]);
							System.out.print(",");
							System.out.print(a[j][3]);
							System.out.print(")=");
						 System.out.printf("%.2f",c[k]);
						 System.out.print("\n");
						}


				}
		}
		}



		return 0;
	}
}

