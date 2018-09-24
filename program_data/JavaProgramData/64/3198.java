public class Point
{
	public int x;
	public int y;
	public int z;
}
public class Distance
{
	public double len;
	public int pt1;
	public int pt2;
}

package <missing>;

public class GlobalMembers
{
	public static double CalDis(Point pt1,Point pt2)
	{
		return Math.sqrt((double)(pt1.x - pt2.x) * (pt1.x - pt2.x) + (pt1.y - pt2.y) * (pt1.y - pt2.y) + (pt1.z - pt2.z) * (pt1.z - pt2.z));
	}
	public static int cmp(Object a, Object b)
	{
		if (((Distance)a).len != ((Distance)b).len)
		{
			return ((Distance)a).len > ((Distance)b).len != 0 ? -1 : 1;
		}
			//return ((Distance *)b)->len - ((Distance *)a)->len;
		//return (*(Distance *)a).pt1 > (*(Distance *)b).pt1 ? 1 : -1;
		if (((Distance)a).pt1 != ((Distance)b).pt1)
		{
			return ((Distance)a).pt1 - ((Distance)b).pt1;
		}
		return ((Distance)a).pt2 - ((Distance)b).pt2;
	}
	/*int cmp( const void *a ,const void *b)
	{
		if((*(Distance *)b).len != (*(Distance *)a).len)
			return (*(Distance *)b).len > (*(Distance *)a).len ? 1 : -1;
		else
			return (*(Distance *)a).pt1 > (*(Distance *)b).pt1 ? 1 : -1;
	}*/
	public static Distance[] ds = tangible.Arrays.initializeWithDefaultDistanceInstances(N);
	public static int Main()
	{
		int n;
		int count = 0;
		int i;
		int j;
		Point[] pts = tangible.Arrays.initializeWithDefaultPointInstances(10);
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
				pts[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pts[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				pts[i].z = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				ds[count].len = CalDis(pts[i], pts[j]);
				ds[count].pt1 = i;
				ds[count++].pt2 = j;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(ds,count,sizeof(ds[0]),cmp);
		for (i = 0;i < count;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",pts[ds[i].pt1].x,pts[ds[i].pt1].y, pts[ds[i].pt1].z,pts[ds[i].pt2].x,pts[ds[i].pt2].y,pts[ds[i].pt2].z,ds[i].len);
		}
		return 0;
	}
}

