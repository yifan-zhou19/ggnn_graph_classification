package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		double x,y;
	//	}
	//	point[50];
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
		double max = 0;
		int j;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			double dis;
			dis = Math.sqrt((point[j].x - point[i].x) * (point[j].x - point[i].x) + (point[j].y - point[i].y) * (point[j].y - point[i].y));
			if (dis > max)
			{
				max = dis;
			}
			}
		}
		System.out.printf("%.4lf\n",max);
	}


}

