package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a;
		a = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum += a[i];
		}
		double aver = sum * 1.0 / (n * 1.0);
		double[] c;
		c = new double[n];
		for (i = 0;i < n;i++)
		{
			c[i] = Math.abs(a[i] * 1.0 - aver);
		}
		int d = 0;
		double max = c[0];
		for (i = 0;i < n;i++)
		{
			if (max < c[i])
			{
				max = c[i];
				d = i;
			}
		}
		int b = 0;
		for (i = 0;i < n;i++)
		{
			if (c[i] == max)
			{
				b++;
			}
		}
		System.out.printf("%d",a[d]);
		if (b != 1)
		{
			for (i = d + 1;i < n;i++)
			{
				if (c[i] == max)
				{
					System.out.printf(",%d",a[i]);
				}
			}
		}
	}


}

