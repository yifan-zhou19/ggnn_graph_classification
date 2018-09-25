package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
	double a;
	double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x;
	//		double y;
	//	};
		point[] d = tangible.Arrays.initializeWithDefaultpointInstances(max);
		for (i = 0;i < n;i++)
		{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		d[i].x = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		d[i].y = tempVar3;
	}
		}
		a = 0;
			for (i = 1;i < n;i++)
			{
			for (k = 0;k < i;k++)
			{
				b = Math.sqrt((d[i].x - d[k].x) * (d[i].x - d[k].x) + (d[i].y - d[k].y) * (d[i].y - d[k].y));


	if (b > a)
	{
	a = b;
	}
			}

			}
		a = (float)(a);
			System.out.printf("%.4f",a);
	return 0;
	}

}

