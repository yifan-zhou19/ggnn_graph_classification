package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int m = 1;
		double dis;
		double dist = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] plx = new double[n];
		double[] ply = new double[n];
		for (i = 0;i < n;i++)
		{
			double X;
			double Y;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				plx[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				ply[i] = Double.parseDouble(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			for (m = 1;m < n;m++)
			{
				dis = Math.sqrt((plx[j] - plx[m]) * (plx[j] - plx[m]) + (ply[j] - ply[m]) * (ply[j] - ply[m]));
				if (dis >= dist)
				{
					dist = dis;
				}
			}
		}
		System.out.printf("%.4f\n",dist);
		return 0;
	}


}

