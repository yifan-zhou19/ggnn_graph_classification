package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int s = 0;
		int[] d = new int[300];
		int t = 0;
		double b;
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
			s = s + a[i];
		}
		b = (double)s / n;
		for (i = 0;i < n;i++)
		{
			c[i] = Math.abs(a[i] - b);
		}
		for (i = 0;i < n;i++)
		{
			if (max < c[i])
			{
				max = c[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] == max)
			{
				d[t] = a[i];
				t++;
			}
		}
		System.out.printf("%d",d[0]);
		for (i = 1;i < t;i++)
		{
			System.out.printf(",%d",d[i]);
		}
	}
}

