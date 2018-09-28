//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public int x1;
	public int x2;
	public int y1;
	public int y2;
	public int z1;
	public int z2;
	public double d;
}

package <missing>;

public class GlobalMembers
{
	public static int[][] point = new int[MAX][3];
	public static double d;
	public static AnonymousClass[] dis = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(DIS);
	public static AnonymousClass mid = new AnonymousClass();
	public static int n;
	public static int m = 0;
	public static int i;
	public static int j;
	public static int Main()
	{
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
				point[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				point[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				point[i][2] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dis[m].x1 = point[i][0];
				dis[m].y1 = point[i][1];
				dis[m].z1 = point[i][2];
				dis[m].x2 = point[j][0];
				dis[m].y2 = point[j][1];
				dis[m].z2 = point[j][2];
				dis[m].d = Math.sqrt(Math.pow((dis[m].x1 - dis[m].x2),2) + Math.pow((dis[m].y1 - dis[m].y2),2) + Math.pow((dis[m].z1 - dis[m].z2),2));
				m++;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m - 1;j++)
			{
				if (dis[j].d < dis[j + 1].d)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: mid=dis[j];
					mid.copyFrom(dis[j]);
					dis[j] = dis[j + 1];
					dis[j + 1] = mid;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",dis[i].x1,dis[i].y1,dis[i].z1,dis[i].x2,dis[i].y2,dis[i].z2,dis[i].d);
		}
		return 0;
	}



}

