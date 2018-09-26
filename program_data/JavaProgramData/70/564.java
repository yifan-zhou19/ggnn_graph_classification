package <missing>;

public class GlobalMembers
{
	public static double[][] point = new double[2][100];
	public static double distance(int i, int j)
	{
		double x = point[0][i] - point[0][j];
		double y = point[1][i] - point[1][j];
		return Math.sqrt(x * x + y * y);
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		double dis = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			point[0][0] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			point[1][0] = Double.parseDouble(tempVar3);
		}

		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				point[0][i] = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				point[1][i] = Double.parseDouble(tempVar5);
			}

			for (j = 0;j < i;j++)
			{
				if (dis < distance(i, j))
				{
					dis = distance(i, j);
				}
			}
		}
		System.out.printf("%.4lf\n",dis);
	}
}

