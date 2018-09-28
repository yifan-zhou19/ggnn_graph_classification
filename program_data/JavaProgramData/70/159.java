package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		double[] dis = new double[num];
		double[] max = new double[num];
		double distance = 0;
		max[0] = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		double x,y;
	//	}
	//	point[num];
		for (i = 0;i < n;i++)
		{
			double x1;
			double y1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x1 = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y1 = Double.parseDouble(tempVar3);
			}
			point[i].x = x1;
			point[i].y = y1;
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dis[j] = Math.sqrt((point[j].x - point[i].x) * (point[j].x - point[i].x) + (point[j].y - point[i].y) * (point[j].y - point[i].y));
				if (dis[j] > max[i])
				{
					max[i] = dis[j];
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (max[i] > distance)
			{
				distance = max[i];
			}
		}
		System.out.printf("%.4lf",distance);
	}

}

