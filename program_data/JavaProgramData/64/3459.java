public class point
{
	public int a;
	public int b;
	public int c;
}
public class dis
{
	public double d;
	public int i;
	public int j;
}

package <missing>;

public class GlobalMembers
{
	public static point[] p = tangible.Arrays.initializeWithDefaultpointInstances(10);
	public static dis[] di = tangible.Arrays.initializeWithDefaultdisInstances(60);
	public static dis x = new dis();
	public static int Main()
	{
		int k;
		int m;
		int q;
		int n;
		int y;
	double z;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (k = 0;k < n;k++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p[k].a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p[k].b = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p[k].c = Integer.parseInt(tempVar4);
		}
	}

	k = 0;
	for (m = 0;m < n;m++)
	{
		q = m + 1;
	for (;q < n;q++)
	{
		z = ((double)p[q].a - (double)p[m].a) * ((double)p[q].a - (double)p[m].a) + ((double)p[q].b - (double)p[m].b) * ((double)p[q].b - (double)p[m].b) + ((double)p[q].c - (double)p[m].c) * ((double)p[q].c - (double)p[m].c);

	di[k].d = (double)Math.sqrt((double)z);
	di[k].i = m;
	di[k].j = q;
	k = k + 1;
	}
	}
	for (y = 0;y < n * (n - 1) / 2 - 1;y++)
	{
		for (k = 0;k < n * (n - 1) / 2;k++)
		{
			if (di[k + 1].d > di[k].d)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: x=di[k];
		x.copyFrom(di[k]);
	di[k] = di[k + 1];
	di[k + 1] = x;
			}
		}
	}
	for (k = 0;k < n * (n - 1) / 2;k++)
	{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",p[di[k].i].a,p[di[k].i].b,p[di[k].i].c,p[di[k].j].a,p[di[k].j].b,p[di[k].j].c,di[k].d);
	}
	}

}

