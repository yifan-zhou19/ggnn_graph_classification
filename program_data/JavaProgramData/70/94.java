package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		float t;
		float max = 0F;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//	   float x,y;
	//	}
	//	dis[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				dis[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				dis[i].y = tempVar3;
			}
		}
		for (int k = 0;k < n;k++)
		{
			for (int j = 0;j < n;j++)
			{
			t = Math.sqrt((dis[k].x - dis[j].x) * (dis[k].x - dis[j].x) + (dis[k].y - dis[j].y) * (dis[k].y - dis[j].y));
			if (t > max)
			{
				max = t;
			}
			}
		}
		System.out.printf("%.4f\n",max);
		return 0;
	}
}

