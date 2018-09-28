public class point
{
	public int[] a = new int[3];
	public int[] b = new int[3];
	public double distant;
}

package <missing>;

public class GlobalMembers
{
	public static point[] p = tangible.Arrays.initializeWithDefaultpointInstances(45);
	public static point change = new point();
	public static void swap(point[] p, int k)
	{
		int r;
		int q;
		for (r = 0;r < k;r++)
		{
			for (q = 0;q < k - r;q++)
			{
				if (p[q].distant < p[q + 1].distant)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: change=p[q];
					change.copyFrom(p[q]);
					p[q] = p[q + 1];
					p[q + 1] = change;
				}
			}
		}
	}
	public static void Main()
	{
		int i;
		int j;
		int k = 0;
		int n;
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
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
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = j + 1;i < n;i++)
			{
				p[k].a[0] = x[j];
				p[k].a[1] = y[j];
				p[k].a[2] = z[j];
				p[k].b[0] = x[i];
				p[k].b[1] = y[i];
				p[k].b[2] = z[i];
				p[k++].distant = Math.sqrt(Math.pow(x[j] - x[i],2) + Math.pow(y[j] - y[i],2) + Math.pow(z[j] - z[i],2));
			}
		}
		swap(p, k - 1);
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",p[i].a[0],p[i].a[1],p[i].a[2],p[i].b[0],p[i].b[1],p[i].b[2],p[i].distant);
		}
	}
}

