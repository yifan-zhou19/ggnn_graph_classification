package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		int l;
		int k;
		double[][] a = new double[100][2];
		double[][] b = new double[100][100];
		double dis = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Double.parseDouble(tempVar3);
			}
		}
		for (m = 0; m < n; m++)
		{
			for (j = 0; j < n; j++)
			{
				b[j][m] = Math.sqrt((a[j][0] - a[m][0]) * (a[j][0] - a[m][0]) + (a[j][1] - a[m][1]) * (a[j][1] - a[m][1]));
			}
		}
		for (l = 0; l < n; l++)
		{
			for (k = 0; k < n; k++)
			{
				if (b[k][l] > dis)
				{
					dis = b[k][l];
				}
			}
		}
		System.out.printf("%.4lf\n", dis);
		return 0;
	}

}

