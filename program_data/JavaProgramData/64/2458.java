public class point
{
	public int x;
	public int y;
	public int z;
}

public class print
{
	public double l;
	public point p1 = new point();
	public point p2 = new point();
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int x;
	public static int y;
	public static int z;
	public static int p;
	public static point[] points = tangible.Arrays.initializeWithDefaultpointInstances(10);
	public static print[] prints = tangible.Arrays.initializeWithDefaultprintInstances(45);
	public static void scan()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z = Integer.parseInt(tempVar4);
			}
			points[i].x = x;
			points[i].y = y;
			points[i].z = z;
		}
	}
	public static void count()
	{
		int x1;
		int y1;
		int z1;
		int x2;
		int y2;
		int z2;
		p = 0;
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				x1 = points[i].x;
				y1 = points[i].y;
				z1 = points[i].z;
				x2 = points[j].x;
				y2 = points[j].y;
				z2 = points[j].z;
				prints[p].l = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2));
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: prints[p].p1=points[i];
				prints[p].p1.copyFrom(points[i]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: prints[p].p2=points[j];
				prints[p].p2.copyFrom(points[j]);
				p++;
			}
		}
	}
	public static void sort()
	{
		print temp = new print();
		for (int k = 1;k <= p;k++)
		{
			for (int i = 0;i < p - k;i++)
			{
				if (prints[i].l < prints[i + 1].l)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=prints[i+1];
					temp.copyFrom(prints[i + 1]);
					prints[i + 1] = prints[i];
					prints[i] = temp;
				}
			}
		}
	}
	public static void print()
	{
		int x1;
		int y1;
		int z1;
		int x2;
		int y2;
		int z2;
		double l;
		for (int i = 0;i < p;i++)
		{
			x1 = prints[i].p1.x;
			y1 = prints[i].p1.y;
			z1 = prints[i].p1.z;
			x2 = prints[i].p2.x;
			y2 = prints[i].p2.y;
			z2 = prints[i].p2.z;
			l = prints[i].l;
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x1,y1,z1,x2,y2,z2,l);
		}
	}
	public static int Main()
	{
		scan();
		count();
		sort();
		print();
		return 0;
	}


}

