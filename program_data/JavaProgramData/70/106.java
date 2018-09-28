package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x;
	//		double y;
	//	}
	//	p[100];
		double[] d = new double[100];
		int n;
		int i = 0;
		int j;
		int k = 0;
		int r;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].y = tempVar3;
			}
		}
		for (k = 0;k <= n - 3;k++)
		{
			for (j = k + 1;j <= n - 2;j++)
			{
				d[m] = Math.sqrt((p[k].x - p[j].x) * (p[k].x - p[j].x) + (p[k].y - p[j].y) * (p[k].y - p[j].y));
				m++;
			}
		}
		for (r = m;r >= 0;r--)
		{
			if (d[r] < d[r + 1])
			{
				d[r] = d[r + 1];
			}
		}
		System.out.printf("%.4f\n",d[0]);
	}

}

