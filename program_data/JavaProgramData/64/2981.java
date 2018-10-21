public class node
{
	public int x;
	public int y;
	public int z;
}
public class d
{
	public double d;
	public int p1;
	public int p2;
}

package <missing>;

public class GlobalMembers
{
	public static node[] p = tangible.Arrays.initializeWithDefaultnodeInstances(10);
	public static d[] dis = tangible.Arrays.initializeWithDefaultdInstances(45);
	public static int n;
	public static int t = 0;

	public static double dist(int x,int y)
	{
		int dx = p[x].x - p[y].x;
		int dy = p[x].y - p[y].y;
		int dz = p[x].z - p[y].z;
		return Math.sqrt(1.0 * dx * dx + 1.0 * dy * dy + 1.0 * dz * dz);
	}

	public static void swap(int i,int j)
	{
		d tmp = dis[i];
		dis[i] = dis[j];
		dis[j] = tmp;
	}

	public static void init()
	{
		int i;
		int j;
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
				p[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i].z = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dis[t].p1 = i;
				dis[t].p2 = j;
				dis[t].d = dist(i, j);
				t++;
			}
		}
	}

	public static void solve()
	{
		int i;
		int j;
		for (i = 0;i < t;i++)
		{
			for (j = 0;j < t - i - 1;j++)
			{
				if (dis[j].d < dis[j + 1].d)
				{
					swap(j, j + 1);
				}
			}

		}
	}

	public static void print()
	{
		int i;
		for (i = 0;i < t;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",p[dis[i].p1].x,p[dis[i].p1].y,p[dis[i].p1].z, p[dis[i].p2].x,p[dis[i].p2].y,p[dis[i].p2].z,dis[i].d);
		}
	}

	public static int Main()
	{
		init();
		solve();
		print();
		return 0;
	}

}

