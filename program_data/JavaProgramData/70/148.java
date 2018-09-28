package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x,y;
	//	}
	//	point[10];
		int n;
		int i;
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
				point[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				point[i].y = tempVar3;
			}
		}
		double[] max = new double[10];
		for (i = 0;i < n - 1;i++)
		{
			int j;
			double[] dis = new double[10];

			for (j = i + 1;j < n;j++)
			{
				dis[j - 1] = Math.sqrt((point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y));
			}

			for (j = i + 1;j < n - 1;j++)
			{
				if (dis[j - 1] > dis[j])
				{
					max[i] = dis[j - 1];
					dis[j] = dis[j - 1];
				}
				else
				{
					max[i] = dis[j];
				}
			}
		}
		double M;
		for (i = 0;i < n - 1;i++)
		{
			if (max[i] > max[i + 1])
			{
				M = max[i];
				max[i + 1] = max[i];
			}
			else
			{
				M = max[i + 1];
			}
		}
		System.out.printf("%.4f",M);
		return 0;
	}
}

