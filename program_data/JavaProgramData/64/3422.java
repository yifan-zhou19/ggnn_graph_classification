public class point
{
	public int x;
	public int y;
	public int z;
}

public class dist
{
	public point p1;
	public point p2;
	public double l;
}

package <missing>;

public class GlobalMembers
{
	public static void sort(dist[] a, int n)
	{
		int i;
		int j;
		dist t = new dist();
		for (i = 0;i < n - 1;i++)
		{
			for (j = n;j > i;j--)
			{
				if (a[j].l > a[j - 1].l)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=a[j];
					t.copyFrom(a[j]);
					a[j] = a[j - 1];
					a[j - 1] = t;
				}
			}
		}
	}

	public static void Main()
	{
		point[] p = tangible.Arrays.initializeWithDefaultpointInstances(10);
		dist[] d = tangible.Arrays.initializeWithDefaultdistInstances(50);
		int n;
		int i;
		int j;
		int c = 0;

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
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[c].p1 = p[i];
				d[c].p2 = p[j];
				d[c].l = Math.sqrt((p[i].x - p[j].x) * (p[i].x - p[j].x) + (p[i].y - p[j].y) * (p[i].y - p[j].y) + (p[i].z - p[j].z) * (p[i].z - p[j].z));
				c++;
			}
		}
		sort(d, c);
		for (i = 0;i < c;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",d[i].p1.x,d[i].p1.y,d[i].p1.z,d[i].p2.x,d[i].p2.y,d[i].p2.z,d[i].l);
		}
	}

}

