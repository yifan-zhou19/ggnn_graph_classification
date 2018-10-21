package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct p
	//	{
	//		double x;
	//		double y;
	//	}
	//	dot[50];
		double l;
		double max = 0;
		int n;
		int i;
		int j;
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
				dot[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				dot[i].y = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < n - i;j++)
			{
				l = Math.sqrt((dot[i].x - dot[i + j].x) * (dot[i].x - dot[i + j].x) + (dot[i].y - dot[i + j].y) * (dot[i].y - dot[i + j].y));
				if (max < l)
				{
					max = l;
				}
			}
		}
		System.out.printf("%.4lf\n",max);
	}
}

