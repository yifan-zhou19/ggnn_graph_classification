package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//{
	//	double x,y;
	//}
	//point[10];
	int n;
	int i;
	int j;
	int m;
	double[][] d = new double[10][10];
	double max = 0.0;
	double dis;
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
	for (j = 0;j < n;j++)
	{
		for (m = j + 1;m < n;m++)
		{
		d[m][j] = (point[m].x - point[j].x) * (point[m].x - point[j].x) + (point[m].y - point[j].y) * (point[m].y - point[j].y);
			if (d[m][j] > max)
			{
				max = d[m][j];
			}
		}
	}
		System.out.printf("%.4f",Math.sqrt(max));
	}


}

