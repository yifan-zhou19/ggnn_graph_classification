package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int n;
	int i;
	int j;
	double Ldist;
	double dist;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct dis
	//{
	//	double x;
	//	double y;
	//}
	//dis[100];
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
			dis[i].x = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			dis[i].y = tempVar3;
		}
	}
	Ldist = Math.sqrt((dis[0].x - dis[1].x) * (dis[0].x - dis[1].x) + (dis[0].y - dis[1].y) * (dis[0].y - dis[1].y));
	for (i = 0;i < n;i++)
	{
		for (j = i + 1;j < n;j++)
		{
		dist = Math.sqrt((dis[i].x - dis[j].x) * (dis[i].x - dis[j].x) + (dis[i].y - dis[j].y) * (dis[i].y - dis[j].y));
	 if (dist > Ldist)
	 {
		 Ldist = dist;
	 }
		}
	}
	System.out.printf("%.4lf",Ldist);
	return 0;
	}
}

