public class POINT
{
	public int x;
	public int y;
	public int z;
}

public class DISTANCE
{
	public int pointx;
	public int pointy;
	public double dis;
}

package <missing>;

public class GlobalMembers
{
	public static int cmp(Object e1, Object e2)
	{
		DISTANCE elem1 = (DISTANCE)e1;
		DISTANCE elem2 = (DISTANCE)e2;
		if (elem1.dis == elem2.dis)
		{
			return (elem1.pointx) - (elem2.pointx);
		}
		if (elem1.dis > elem2.dis)
		{
			return -1;
		}
		return 1;
	}

	public static int Main()
	{
		int n;
		POINT[] data = tangible.Arrays.initializeWithDefaultPOINTInstances(11);
		DISTANCE[] distance = tangible.Arrays.initializeWithDefaultDISTANCEInstances(10000);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(data[i].x) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(data[i].y) = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(data[i].z) = Integer.parseInt(tempVar4);
			}
		}
		int j;
		int cnt = 0;
		for (i = 0; i < n; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				distance[cnt].pointx = i;
				distance[cnt].pointy = j;
				distance[cnt].dis = Math.sqrt((data[i].x - data[j].x) * (data[i].x - data[j].x) + (data[i].y - data[j].y) * (data[i].y - data[j].y) + (data[i].z - data[j].z) * (data[i].z - data[j].z));
				cnt++;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(distance, cnt, sizeof(DISTANCE), cmp);
		for (i = 0; i < cnt; i++)
		{
			int x = distance[i].pointx;
			int y = distance[i].pointy;
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n", data[x].x, data[x].y, data[x].z, data[y].x, data[y].y, data[y].z, distance[i].dis);
		}
		return 0;
	}


}

