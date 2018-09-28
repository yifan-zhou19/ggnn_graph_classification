package <missing>;

public class GlobalMembers
{
	public static double cal(int[] a, int[] b)
	{
		int i = 0;
		int sum = 0;
		for (;i < 3;i++)
		{
			sum += (a[i] - b[i]) * (a[i] - b[i]);
		}
		return Math.sqrt(sum);
	}
	public static int change(double[] a, double[] b)
	{
		double temp;
		int i;
		for (i = 0;i < 7;i++)
		{
			temp = a[i];
			a[i] = b[i];
			b[i] = temp;
		}
		return 0;
	}
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[][] a = new int[10][3];
		int k1 = 0;
		int k2;
		double[][] b = new double[60][7];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{

				for (k2 = 0;k2 < 3;k2++)
				{
					b[k1][k2] = a[i][k2];
				}
				for (k2 = 0;k2 < 3;k2++)
				{
					b[k1][k2 + 3] = a[j][k2];
				}
				b[k1][6] = cal(a[i], a[j]);
				k1++;
			}
		}
		for (i = 0;i < k1;i++)
		{
			for (j = 0;j < k1 - 1;j++)
			{
				if (b[j][6] < b[j + 1][6])
				{
					change(b[j], b[j + 1]);
				}
			}
		}
		for (i = 0;i < k1;i++)
		{
			System.out.printf("(%.0lf,%.0lf,%.0lf)-(%.0lf,%.0lf,%.0lf)=%.2lf\n",b[i][0],b[i][1],b[i][2],b[i][3],b[i][4],b[i][5],b[i][6]);
		}


	}
}

