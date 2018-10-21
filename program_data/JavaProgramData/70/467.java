package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	int j;
	int i;
	int n;
	double d;
	double maxd = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct
	//{
	//	double x,y;
	//}
	//pl[100];

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
			pl[i].x = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			pl[i].y = tempVar3;
		}
	for (j = 0;j < i;j++)
	{
		d = Math.sqrt((pl[i].x - pl[j].x) * (pl[i].x - pl[j].x) + (pl[i].y - pl[j].y) * (pl[i].y - pl[j].y));
	if (d > maxd)
	{
	maxd = d;
	}
	}
	}
	System.out.printf("%.4lf\n",maxd);


	}
}

