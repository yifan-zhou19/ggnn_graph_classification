package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		double x;
		double y;
		double s;
		double dis = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 2)
		{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//		struct point
	//		{
	//			double x, y;
	//		}
	//		points[1000];
			for (i = 0;i < n - 1;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x = Double.parseDouble(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					y = Double.parseDouble(tempVar3);
				}
				points[i].x = x;
				points[i].y = y;
			}
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - 1;j++)
				{
					s = Math.sqrt((points[j].y - points[i].y) * (points[j].y - points[i].y) + (points[j].x - points[i].x) * (points[j].x - points[i].x));
					if (s >= dis)
					{
						dis = s;
					}
				}
			}
			System.out.printf("%.4lf",dis);
		}
	}




}

