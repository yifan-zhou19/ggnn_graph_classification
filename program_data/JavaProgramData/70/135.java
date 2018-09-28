package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int n;
		int i;
	double b;
	double dis;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct point
	//{
	//	double x;
	//	double y;
	//};
	point[] d = tangible.Arrays.initializeWithDefaultpointInstances(score);
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
	dis = 0;
	for (i = 0;i < n;i++)

	{
		for (k = 0;k < i;k++)
		{
		b = Math.sqrt((d[i].x - d[k].x) * (d[i].x - d[k].x) + (d[i].y - d[k].y) * (d[i].y - d[k].y));
			if (b > dis)
			{
				dis = b;
			}
		}
	}
	dis = (float)(dis);
	System.out.printf("%.4f",dis);
	}
}

