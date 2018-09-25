package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] dis = new double[10000];
		double t = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x,y;
	//	}
	//	point[1000];
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
			for (j = i;j < n;j++)
			{
				dis[k] = Math.sqrt((point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y));
				k++;
			}
		}
		for (k = 0;k < (n * (n - 1) / 2);k++)
		{
			if (t < dis[k])
			{
				t = dis[k];
			}
		}
		System.out.printf("%.4lf\n",t);
	}


}

