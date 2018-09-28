package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i = 0;
		int p;
		int j;

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
	//	top[1000];

		double distance;
		double max1 = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				top[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				top[i].y = tempVar3;
			}
		}
		for (p = 0;p < n;p++)
		{
		for (j = 0;j < n;j++)
		{
				distance = Math.sqrt((top[p].x - top[j].x) * (top[p].x - top[j].x) + (top[p].y - top[j].y) * (top[p].y - top[j].y));
				if (distance >= max1)
				{
					max1 = distance;
				}
		}
		}
		System.out.printf("%.4f\n",max1);
	}


}

