package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		double x,y;
	//	}
	//	a[PI];

		int i;
		int j;
		int num;
		double max;
		double tmp1;
		double tmp2;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		max = 0;
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead("" "");
			if (tempVar3 != null)
			{
				a[i].y = tempVar3;
			}
		}

		for (i = 0;i < num;i++)
		{
			for (j = i + 1;j < num;j++)
			{
				double ax;
				double ay;
				ax = a[i].x - a[j].x;
				ay = a[i].y - a[j].y;
				tmp1 = Math.pow(ax,2) + Math.pow(ay,2);
				tmp2 = Math.sqrt(tmp1);
				if (tmp2 > max)
				{
					max = (float)tmp2;
				}
			}
		}
		System.out.printf("%.4f",max);
		return 0;
	}
}

