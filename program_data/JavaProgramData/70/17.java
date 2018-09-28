package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		float x;
		float y;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		float x;
	//		float y;
	//	}
	//	p[100];
		double s;
		double smax = 0;
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
				x = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Float.parseFloat(tempVar3);
			}
			p[i].x = x;
			p[i].y = y;
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{

				s = Math.sqrt((p[i].x - p[j].x) * (p[i].x - p[j].x) + (p[i].y - p[j].y) * (p[i].y - p[j].y));
				if (smax >= s)
				{
					continue;
				}
				else
				{
					smax = s;
				}
			}
		}
		System.out.printf("%.4lf\n", smax);
		return 0;
	}
}

