package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int[] n = new int[100];
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		double[][] c = new double[100][100];
		double sum = 0.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i < m;i++)
		{
			a[i][0] = 2;
			a[i][1] = 3;
			b[i][0] = 1;
			b[i][1] = 2;
			for (j = 0;j < n[i];j++)
			{
				a[i][j + 2] = a[i][j] + a[i][j + 1];
				b[i][j + 2] = b[i][j] + b[i][j + 1];
				c[i][j] = 1.0 * a[i][j] / b[i][j];
				sum += c[i][j];
			}
			System.out.printf("%.3f\n",sum);
			sum = 0;
		}
		return 0;
	}
}

