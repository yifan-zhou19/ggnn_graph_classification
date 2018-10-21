package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int k;
		int i;
		double max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		double x,y,dis[1000];
	//	}
	//	a[1000];
		for (k = 1;k <= n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[k].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[k].y = tempVar3;
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 1;i <= n;i++)
			{
			 a[k].dis[i] = (a[k].x - a[i].x) * (a[k].x - a[i].x) + (a[k].y - a[i].y) * (a[k].y - a[i].y);
			 if (a[k].dis[i] >= max)
			 {
				 max = a[k].dis[i];
			 }

			}
		}
		System.out.printf("%.4f\n",Math.sqrt(max));
	}


}

