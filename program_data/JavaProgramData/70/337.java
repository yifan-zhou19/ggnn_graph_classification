public class point
{
	public double x;
  public double y;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		point[] a = tangible.Arrays.initializeWithDefaultpointInstances(50);
		int i;
		int j;
		int n;
		int k = 0;
		double max;
		double[] b = new double[50];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].y = Double.parseDouble(tempVar3);
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 1;i < n - j;i++)
			{
				b[k] = Math.sqrt((a[i].x - a[i + j].x) * (a[i].x - a[i + j].x) + (a[i].y - a[i + j].y) * (a[i].y - a[i + j].y));
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
		System.out.printf("%.4lf\n",max);
	}


}

