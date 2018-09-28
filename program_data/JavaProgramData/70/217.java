package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		double[] dis = new double[100];
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		double x;
	//		double y;
	//	}
	//	point[10];
		for (i = 0;i < a;i++)
		{
			double m;
			double n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Double.parseDouble(tempVar3);
			}
			point[i].x = m;
			point[i].y = n;
		}
		for (i = 0;i < a - 1;i++)
		{
			for (j = a - 1;j > i;j--)
			{
		   dis[num] = Math.sqrt((point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y));
			num++;
			}
		}
		for (i = 0;i < num;i++)
		{
			double t;
			if (dis[i] > dis[i + 1])
			{
			t = dis[i + 1];
			dis[i + 1] = dis[i];
			dis[i] = t;
			}
			else
			{
				;
			}
		}
			System.out.printf("%.4lf",dis[num]);
		return 0;
	}
}

