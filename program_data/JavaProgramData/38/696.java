package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[][] x = new double[100][101];
		double[][] xa = new double[100][2];
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
				x[i][0] = Double.parseDouble(tempVar2);
			}
			x[i][0] = (int)x[i][0];
			for (j = 1;j <= x[i][0];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Double.parseDouble(tempVar3);
				}
				xa[i][0] += x[i][j];
			}
			xa[i][0] = xa[i][0] / x[i][0];
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j <= x[i][0];j++)
			{
				xa[i][1] += (x[i][j] - xa[i][0]) * (x[i][j] - xa[i][0]);
			}
			xa[i][1] = Math.sqrt(xa[i][1] / x[i][0]);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.5lf\n",xa[i][1]);
		}
		return 0;
	}
}

