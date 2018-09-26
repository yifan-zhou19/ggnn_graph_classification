package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[10000];
		int s = 1;
		int t;
		int max;
		int min;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				min = a[i];
			}
			if (a[i] <= min)
			{
				min = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				max = b[i];
			}
			if (b[i] >= max)
			{
				max = b[i];
			}
		}
		for (t = 2 * min;t <= 2 * max;t++)
		{
			c[t] = 0;
		}
		for (i = 0;i < n;i++)
		{
			for (t = 2 * a[i];t <= 2 * b[i]; t++)
			{
				c[t] = 1;
			}
		}
		for (t = 2 * min;t <= 2 * max;t++)
		{
			s *= c[t];
		}
		if (s == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}

}

