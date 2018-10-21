package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		double x, y;
	//	}
	//	a[100];
		for (i = 0;i < n;i++)
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
		for (i = 0;i < n;i++)
		{
			for (int j = 0;j < n && j != i;j++)
			{
				double dis = Math.sqrt(Math.pow(a[i].x - a[j].x,2) + Math.pow(a[i].y - a[j].y,2));
				if (dis > max)
				{
					max = dis;
				}
			}
		}
		System.out.printf("%.4f\n", max);
		return 0;
	}
}

