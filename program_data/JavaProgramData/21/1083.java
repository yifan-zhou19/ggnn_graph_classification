package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int l = 0;
		int[] a = new int[400];
		double max = 0;
		double s = 0;
		double p;
		double[] b = new double[400];
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
		}
		for (i = 0;i < n;i++)
		{
			s += a[i];
		}
		p = s / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] > p)
			{
				b[i] = a[i] - p;
			}
			else
			{
				b[i] = p - a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				if (l != 0)
				{
					System.out.printf(",%d",a[i]);
				}
				else
				{
					System.out.printf("%d",a[i]);
					l += 1;
				}
			}
		}
	}


}

