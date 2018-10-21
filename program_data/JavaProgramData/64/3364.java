public class POINT
{
	public int x;
	public int y;
	public int z;
}
public class DIST
{
	public int a;
	public int b;
	public double dis;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		double td;
		POINT[] point = tangible.Arrays.initializeWithDefaultPOINTInstances(20);
		DIST[] dists = tangible.Arrays.initializeWithDefaultDISTInstances(200);
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
				point[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				point[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				point[i].z = Integer.parseInt(tempVar4);
			}
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dists[k].a = i;
				dists[k].b = j;
				dists[k].dis = Math.sqrt((point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y) + (point[i].z - point[j].z) * (point[i].z - point[j].z));
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = k - 1;j > i;j--)
			{
				if (dists[j].dis > dists[j - 1].dis)
				{
					t = dists[j].a;
					dists[j].a = dists[j - 1].a;
					dists[j - 1].a = t;
					t = dists[j].b;
					dists[j].b = dists[j - 1].b;
					dists[j - 1].b = t;
					td = dists[j].dis;
					dists[j].dis = dists[j - 1].dis;
					dists[j - 1].dis = td;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n", point[dists[i].a].x,point[dists[i].a].y,point[dists[i].a].z, point[dists[i].b].x,point[dists[i].b].y,point[dists[i].b].z, dists[i].dis);
		}
		return 0;
	}
}

