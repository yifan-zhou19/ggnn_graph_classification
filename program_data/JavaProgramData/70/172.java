package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		double max = 0;
		double dis2;
		double dis;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x;
	//		double y;
	//	}
	//	points[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				points[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				points[i].y = tempVar3;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				dis2 = (points[i].x - points[j].x) * (points[i].x - points[j].x) + (points[i].y - points[j].y) * (points[i].y - points[j].y);
				if (dis2 > max)
				{
					max = dis2;
				}
			}
		}
		dis = Math.pow(max,0.5);
		System.out.printf("%.4lf\n",dis);
		return 0;
	}

}

