public class Point
{
	public int x1;
	public int x2;
	public int x3;
}

public class Dis
{
	public Point point1 = new Point();
	public Point point2 = new Point();
	public float d;
}

package <missing>;

public class GlobalMembers
{
	public static Point point1 = new Point();
	public static Point point2 = new Point();
	public static Point[] p = tangible.Arrays.initializeWithDefaultPointInstances(11);
	public static Dis[] dis = tangible.Arrays.initializeWithDefaultDisInstances(46);
	public static Dis tmp = new Dis();

	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].x1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].x2 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i].x3 = Integer.parseInt(tempVar4);
			}
		}


		for (k = 0,m = n - 1;m > 0;m--)
		{

			for (i = 1;i <= m;i++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: dis[k+i].point1=p[n-m];
				dis[k + i].point1.copyFrom(p[n - m]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: dis[k+i].point2=p[n-m+i];
				dis[k + i].point2.copyFrom(p[n - m + i]);
				dis[k + i].d = Math.sqrt((dis[k + i].point1.x1 - dis[k + i].point2.x1) * (dis[k + i].point1.x1 - dis[k + i].point2.x1) + (dis[k + i].point1.x2 - dis[k + i].point2.x2) * (dis[k + i].point1.x2 - dis[k + i].point2.x2) + (dis[k + i].point1.x3 - dis[k + i].point2.x3) * (dis[k + i].point1.x3 - dis[k + i].point2.x3));
			}
			k = k + m;
		}

		for (i = 1;i < (n * (n - 1) / 2);i++)
		{
			for (j = 1;j <= (n * (n - 1) / 2 - i);j++)
			{
				if (dis[j].d < dis[j + 1].d)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tmp=dis[j];
					tmp.copyFrom(dis[j]);
					dis[j] = dis[j + 1];
					dis[j + 1] = tmp;
				}
			}
		}

		for (i = 1;i <= n * (n - 1) / 2;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",dis[i].point1.x1,dis[i].point1.x2,dis[i].point1.x3,dis[i].point2.x1,dis[i].point2.x2,dis[i].point2.x3,dis[i].d);
		}
		return 0;
	}



}

