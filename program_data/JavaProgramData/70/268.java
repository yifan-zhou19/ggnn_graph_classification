package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x;
	//		double y;
	//	};
		point[] point = tangible.Arrays.initializeWithDefaultpointInstances(500);
		double[] distance = new double[500];
		int n;
		int i;
		int j;
		double max = 0;
		double Max = 0;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				point[i].y = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			double X = point[i].x;
			double Y = point[i].y;
			for (j = 0;j < n;j++)
			{
				distance[j] = Math.sqrt((X - point[j].x) * (X - point[j].x) + (Y - point[j].y) * (Y - point[j].y));
				if (distance[j] > max)
				{
					max = distance[j];
				}
			}
			if (max > Max)
			{
				Max = max;
			}
		}
		System.out.printf("%.4lf\n", Max);
		return 0;
	}
}

