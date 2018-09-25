package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	double a;
	double b;
	double dis;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct points
	//{
	//double x,y;
	//   }
	//   point[N];
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
		point[i].x = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		point[i].y = tempVar3;
	}
	}
	a = (point[0].x - point[1].x) * (point[0].x - point[1].x) + (point[0].y - point[1].y) * (point[0].y - point[1].y);
	for (i = 0;i < n - 1;i++)
	{
	for (j = i + 1;j < n;j++)
	{
	b = (point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y);
	if (a < b)
	{
	a = b;
	}
	}
	}
	dis = Math.sqrt(a);
	System.out.printf("%.4f\n",dis);
	return 0;

	}
}

