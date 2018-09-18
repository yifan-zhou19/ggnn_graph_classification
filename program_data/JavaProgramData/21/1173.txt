package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n;
		int i;
		int j;
		int[] a = new int[300];
		int s = 0;
		int[] d = new int[300];
		int t;
		double ave;
		double[] c = new double[300];
		double max = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			s += a[i];
		}
		ave = (double)s / n;
		for (i = 0;i < n;i++)
		{
			c[i] = Math.abs(a[i] - ave);
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] == max)
			{
				d[m++] = a[i];
			}
		}
		for (j = 1;j < m;j++)
		{
			for (i = 0;i < m - j;i++)
			{
				if (d[i] > d[i + 1])
				{
					t = d[i];
					d[i] = d[i + 1];
					d[i + 1] = t;
				}
			}
		}
		System.out.printf("%d",d[0]);
		for (i = 1;i < m;i++)
		{
			System.out.printf(",%d",d[i]);
		}
		return 0;
	}
}

