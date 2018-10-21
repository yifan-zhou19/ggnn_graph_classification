package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int b = 0;
		int i;
		int j;
		int n;
		double max = 0;
		double dis;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		float x,y;
	//	}
	//	p[100];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].y = tempVar3;
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = i + 1; j <= n;j++)
			{
				dis = (double)Math.sqrt((p[i].x - p[j].x) * (p[i].x - p[j].x) + (p[i].y - p[j].y) * (p[i].y - p[j].y));
				if (max < dis)
				{
					max = dis;
				}
			}
		}
		System.out.printf("%.4f\n", max);
	}

}

