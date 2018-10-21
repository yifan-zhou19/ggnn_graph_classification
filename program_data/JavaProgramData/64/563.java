package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[11][4];
		int[][] b = new int[60][7];
		int[] t = new int[7];
		double[] c = new double[60];
		double t0;
		int i;
		int j;
		int l = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= 3;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				l++;
				b[l][1] = a[i][1];
				b[l][2] = a[i][2];
				b[l][3] = a[i][3];
				b[l][4] = a[j][1];
				b[l][5] = a[j][2];
				b[l][6] = a[j][3];
				c[l] = Math.sqrt((a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]) + (a[i][3] - a[j][3]) * (a[i][3] - a[j][3]));
			}
		}
		for (j = 1;j <= n * (n - 1) / 2 - 1;j++)
		{
			for (l = n * (n - 1) / 2 - 1;l >= j;l--)
			{
				if (c[l] < c[l + 1])
				{
					for (i = 1;i <= 6;i++)
					{
						t[i] = b[l][i];
						b[l][i] = b[l + 1][i];
						b[l + 1][i] = t[i];
					}
					t0 = c[l];
					c[l] = c[l + 1];
					c[l + 1] = t0;
				}
			}
		}
		for (l = 1;l <= n * (n - 1) / 2;l++)
		{
			System.out.print("(");
			System.out.print(b[l][1]);
			System.out.print(",");
			System.out.print(b[l][2]);
			System.out.print(",");
			System.out.print(b[l][3]);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(b[l][4]);
			System.out.print(",");
			System.out.print(b[l][5]);
			System.out.print(",");
			System.out.print(b[l][6]);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", c[l]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}


}

