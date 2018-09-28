package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		float farest;
		float[][] a = new float[100][2];
		float[][] d = new float[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			d[i][j] = (a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]);
			};
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			if (d[i][j] > d[i][j + 1])
			{
		d[i][j + 1] = d[i][j];
			}
			};
		}
		for (i = 0;i < n;i++)
		{
			if (d[i][n - 1] > d[i + 1][n - 1])
			{
		d[i + 1][n - 1] = d[i][n - 1];
			}
		}

		farest = Math.sqrt(d[n - 1][n - 1]);
		System.out.printf("%.4f\n",farest);
		return 0;
	}
}

