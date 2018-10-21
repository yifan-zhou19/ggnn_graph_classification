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
	//	a[10000];
		double l;
		double max = 0;
		int i;
		int j;
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].y = tempVar3;
			}
		}

		for (i = 1;i < n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
					l = (a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y);
					if (l > max)
					{
						max = l;
					}
			}
		}
			max = Math.sqrt(max);
			System.out.printf("%.4lf",max);
		return 0;
	}


}

