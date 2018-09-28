package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x,y;
	//
	//	}
	//	point[20];
		int n;
		int i;
		int j;
		double[][] d = new double[20][20];
		double max = 0.0;
		double distance;
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
				point[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				point[i].y = tempVar3;
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			for (i = j + 1;i <= n - 1;i++)
			{

				d[j][i] = (point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y);
				if (d[j][i] > max)
				{
					max = d[j][i];
				}
			}
		}
		distance = Math.sqrt(max);
		System.out.printf("%.4f\n",distance);
	}


}

