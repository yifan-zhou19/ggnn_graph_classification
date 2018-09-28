package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] x = new float[100];
		float[] y = new float[100];
		int n;
		int i;
		int j;
		double[][] dis = new double[100][100];
		double Dis;

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
				x[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Float.parseFloat(tempVar3);
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n - 1;j++)
			{
		dis[i][j] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
		if (dis[0][0] <= dis[i][j])
		{
			dis[0][0] = dis[i][j];
		}
			}
		}

		Dis = Math.sqrt(dis[0][0]);

		System.out.printf("%.4f",Dis);

		return 0;
	}


}

