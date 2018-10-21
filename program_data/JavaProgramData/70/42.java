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
	//	}
	//	point[100];
		int i;
		int j;
		int n;
		double M = 0.0;
		double length;
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
			for (j = 0;j < n;j++)
			{
				length = Math.sqrt((point[j].x - point[i].x) * (point[j].x - point[i].x) + (point[j].y - point[i].y) * (point[j].y - point[i].y));
				if (length > M)
				{
					M = length;
				}
			}
		}
		System.out.printf("%.4f\n",M);


		return 0;
	}


}

