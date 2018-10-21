package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x,y;
	//	}
	//	point[n];
		int i = 0;
		for (i = 0;i < a;i++)
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

		int v = 0;
		double d = 0;
		double max = 0;
		for (i = 0;i < a;i++)
		{
			for (v = 0;v < a;v++)
			{
				d = Math.sqrt((point[i].x - point[v].x) * (point[i].x - point[v].x) + (point[i].y - point[v].y) * (point[i].y - point[v].y));
					if (d > max)
					{
						max = d;
					}
			}
		}
		System.out.printf("%.4f\n", max);
		return 0;
	}


}

