package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x;
	//		double y;
	//	}
	//	pot[10];
		double max = 0;
		double temp;
		int i;
		int j;
		int total;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			total = Integer.parseInt(tempVar);
		}
		for (i = 0;i < total;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pot[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pot[i].y = tempVar3;
			}
		}

		for (i = 0;i < total - 1;i++)
		{
			for (j = i + 1;j < total;j++)
			{
				if (((temp = distance(i,j)) - max) > 1e-6)
				{
					max = temp;
				}
			}
		}
		System.out.printf("%.4lf\n",max);
	}
}

