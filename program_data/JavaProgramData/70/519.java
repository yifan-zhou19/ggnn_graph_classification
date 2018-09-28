package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x,y;
	//	}
	//	dian[1000];
		int n;
		int i;
		int j;
		double mdis = 0;
		double dis;
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
				dian[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				dian[i].y = tempVar3;
			}
		}
		for (i = 0;i < (n - 1);i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dis = (double)Math.sqrt((dian[i].x - dian[j].x) * (dian[i].x - dian[j].x) + (dian[i].y - dian[j].y) * (dian[i].y - dian[j].y));

				if (mdis < dis)
				{
				mdis = dis;
				}
			}
		}
		System.out.printf("%.4lf\n",mdis);
	}


}

