package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		int[][] c = new int[11][11];
		int[][] d = new int[11][11];
		int[][] e = new int[11][11];
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[5][5] = m;
		int i;
		int j;
		int i1;
		int j1;
		int i2;
		int j2;
		int i3;
		int j3;
		int i4;
		int j4;
		if (n == 1)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					b[i][j] = 2 * a[i][j] + a[i][j - 1] + a[i][j + 1] + a[i - 1][j] + a[i + 1][j] + a[i + 1][j + 1] + a[i + 1][j - 1] + a[i - 1][j + 1] + a[i - 1][j - 1];
				}
			}
			for (i1 = 1;i1 <= 9;i1++)
			{
				for (j1 = 1;j1 <= 8;j1++)
				{
					System.out.printf("%d ",b[i1][j1]);
				}
				System.out.printf("%d\n",b[i1][j1]);
			}
		}
		if (n == 2)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					b[i][j] = 2 * a[i][j] + a[i][j - 1] + a[i][j + 1] + a[i - 1][j] + a[i + 1][j] + a[i + 1][j + 1] + a[i + 1][j - 1] + a[i - 1][j + 1] + a[i - 1][j - 1];
				}
			}
			for (i1 = 1;i1 <= 9;i1++)
			{
				for (j1 = 1;j1 <= 9;j1++)
				{
					c[i1][j1] = 2 * b[i1][j1] + b[i1][j1 - 1] + b[i1][j1 + 1] + b[i1 - 1][j1] + b[i1 + 1][j1] + b[i1 + 1][j1 + 1] + b[i1 + 1][j1 - 1] + b[i1 - 1][j1 + 1] + b[i1 - 1][j1 - 1];
				}
			}
			for (i2 = 1;i2 <= 9;i2++)
			{
				for (j2 = 1;j2 <= 8;j2++)
				{
					System.out.printf("%d ",c[i2][j2]);
				}
				System.out.printf("%d\n",c[i2][j2]);
			}
		}
		if (n == 3)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					b[i][j] = 2 * a[i][j] + a[i][j - 1] + a[i][j + 1] + a[i - 1][j] + a[i + 1][j] + a[i + 1][j + 1] + a[i + 1][j - 1] + a[i - 1][j + 1] + a[i - 1][j - 1];
				}
			}
			for (i1 = 1;i1 <= 9;i1++)
			{
				for (j1 = 1;j1 <= 9;j1++)
				{
					c[i1][j1] = 2 * b[i1][j1] + b[i1][j1 - 1] + b[i1][j1 + 1] + b[i1 - 1][j1] + b[i1 + 1][j1] + b[i1 + 1][j1 + 1] + b[i1 + 1][j1 - 1] + b[i1 - 1][j1 + 1] + b[i1 - 1][j1 - 1];
				}
			}
			for (i2 = 1;i2 <= 9;i2++)
			{
				for (j2 = 1;j2 <= 9;j2++)
				{
					d[i2][j2] = 2 * c[i2][j2] + c[i2][j2 - 1] + c[i2][j2 + 1] + c[i2 - 1][j2] + c[i2 + 1][j2] + c[i2 + 1][j2 + 1] + c[i2 + 1][j2 - 1] + c[i2 - 1][j2 + 1] + c[i2 - 1][j2 - 1];
				}
			}
			for (i3 = 1;i3 <= 9;i3++)
			{
				for (j3 = 1;j3 <= 8;j3++)
				{
					System.out.printf("%d ",d[i3][j3]);
				}
				System.out.printf("%d\n",d[i3][j3]);
			}
		}
		if (n == 4)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					b[i][j] = 2 * a[i][j] + a[i][j - 1] + a[i][j + 1] + a[i - 1][j] + a[i + 1][j] + a[i + 1][j + 1] + a[i + 1][j - 1] + a[i - 1][j + 1] + a[i - 1][j - 1];
				}
			}
			for (i1 = 1;i1 <= 9;i1++)
			{
				for (j1 = 1;j1 <= 9;j1++)
				{
					c[i1][j1] = 2 * b[i1][j1] + b[i1][j1 - 1] + b[i1][j1 + 1] + b[i1 - 1][j1] + b[i1 + 1][j1] + b[i1 + 1][j1 + 1] + b[i1 + 1][j1 - 1] + b[i1 - 1][j1 + 1] + b[i1 - 1][j1 - 1];
				}
			}
			for (i2 = 1;i2 <= 9;i2++)
			{
				for (j2 = 1;j2 <= 9;j2++)
				{
					d[i2][j2] = 2 * c[i2][j2] + c[i2][j2 - 1] + c[i2][j2 + 1] + c[i2 - 1][j2] + c[i2 + 1][j2] + c[i2 + 1][j2 + 1] + c[i2 + 1][j2 - 1] + c[i2 - 1][j2 + 1] + c[i2 - 1][j2 - 1];
				}
			}
			for (i3 = 1;i3 <= 9;i3++)
			{
				for (j3 = 1;j3 <= 9;j3++)
				{
					e[i3][j3] = 2 * d[i3][j3] + d[i3][j3 - 1] + d[i3][j3 + 1] + d[i3 - 1][j3] + d[i3 + 1][j3] + d[i3 + 1][j3 + 1] + d[i3 + 1][j3 - 1] + d[i3 - 1][j3 + 1] + d[i3 - 1][j3 - 1];
				}
			}
			for (i4 = 1;i4 <= 9;i4++)
			{
				for (j4 = 1;j4 <= 8;j4++)
				{
					System.out.printf("%d ",e[i4][j4]);
				}
				System.out.printf("%d\n",e[i4][j4]);
			}
		}
	}
}

