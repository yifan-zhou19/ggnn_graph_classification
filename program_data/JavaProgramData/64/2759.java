public class dot
{
	public int x;
	public int y;
	public int z;
}
public class dist
{
	public int d1;
	public int d2;
	public float dis;
}

package <missing>;

public class GlobalMembers
{
	public static dot[] dots = tangible.Arrays.initializeWithDefaultdotInstances(10);
	public static dist[] dists = tangible.Arrays.initializeWithDefaultdistInstances(45);
	public static int cmp(Object p1, Object p2)
	{
		dist l1 = new dist();
		dist l2 = new dist();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: l1=*(struct dist *)p1;
		l1.copyFrom((dist)p1);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: l2=*(struct dist *)p2;
		l2.copyFrom((dist)p2);
		if (l1.dis > l2.dis)
		{
			return -1;
		}
		else if (l1.dis < l2.dis)
		{
			return 1;
		}
		else
		{
			if (l1.d1 != l2.d1)
			{
				return l1.d1 - l2.d1;
			}
			else
			{
				return l1.d2 - l2.d2;
			}
		}
		return 0;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t = 0;
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
				dots[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				dots[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				dots[i].z = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dists[t].d1 = i;
				dists[t].d2 = j;
				dists[t].dis = Math.sqrt((dots[i].x - dots[j].x) * (dots[i].x - dots[j].x) + (dots[i].y - dots[j].y) * (dots[i].y - dots[j].y) + (dots[i].z - dots[j].z) * (dots[i].z - dots[j].z));
				t++;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(dists[0],t,sizeof(dist),cmp);
		for (i = 0;i < t;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",dots[dists[i].d1].x,dots[dists[i].d1].y,dots[dists[i].d1].z,dots[dists[i].d2].x,dots[dists[i].d2].y,dots[dists[i].d2].z,dists[i].dis);
		}
		return 0;
	}

}

