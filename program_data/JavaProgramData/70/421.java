public class point
{
	public double x;
	public double y;
}

package <missing>;

public class GlobalMembers
{
	public static point[] a = tangible.Arrays.initializeWithDefaultpointInstances(100);
	public static void Main()
	{
		double di = new double(double x1,double y1,double x2,double y2);
		int n;
		int i;
		int j;
		int k = 0;
		double max;
		double[] b = new double[100];
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
				a[i].x = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].y = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 1;j < n - i;j++)
			{
					b[k] = di(a[i].x, a[i].y, a[j + i].x, a[j + i].y);
					k++;
			}
		}
		max = b[0];
		for (i = 1;i < k - 1;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		System.out.printf("%.4lf",max);
	}
	public static double di(double x1,double y1,double x2,double y2)
	{
		return (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
	}



}

