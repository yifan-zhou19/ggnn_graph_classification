package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Distance
	//	{
	//		int a,b;
	//		double d;
	//	}
	//	dis[50],t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 1 + i;j <= n - 1;j++)
			{
				if (i == j)
				{
					continue;
				}
				dis[k].d = Math.sqrt((double)((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j])));
				dis[k].a = i;
				dis[k].b = j;
				k++;
			}
		}
		for (i = 0;i <= k - 2;i++)
		{
			for (j = 0;j <= k - 2 - i;j++)
			{
				if (dis[j].d < dis[j + 1].d)
				{
					t = dis[j];
					dis[j] = dis[j + 1];
					dis[j + 1] = t;
				}
			}
		}
		for (i = 0;i <= k - 1;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[dis[i].a],y[dis[i].a],z[dis[i].a],x[dis[i].b],y[dis[i].b],z[dis[i].b],dis[i].d);
		}
		return 0;
	}
}

