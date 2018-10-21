public class point
{
	public float x;
	public float y;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int num;
		point[] a = tangible.Arrays.initializeWithDefaultpointInstances(50);
		double dis = 0;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].x = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].y = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < num - 1;i++)
		{
			for (j = i + 1;j < num;j++)
			{
		d = (a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y);
				if (d > dis)
				{
					dis = d;
				}
			}
		}
		System.out.printf("%.4lf",Math.sqrt(dis));
	return 0;
	}
}

