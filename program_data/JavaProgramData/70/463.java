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
	//	p[100];

		int i;
		int j;
		int n;
		double maxd = 0.0;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].y = tempVar3;
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				d = Math.sqrt((p[j].x - p[i].x) * (p[j].x - p[i].x) + (p[j].y - p[i].y) * (p[j].y - p[i].y));
				if (d > maxd)
				{
					maxd = d;
				}
			}
		}
		System.out.printf("%.4lf\n",maxd);

	}

}

