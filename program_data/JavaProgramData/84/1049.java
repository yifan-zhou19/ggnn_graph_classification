package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int max;
		int smax;
		int i;
		int n;
		max = smax = i = n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		if (a[1] > a[2])
		{
			max = a[1];
			smax = a[2];
		}
		else
		{
			max = a[2];
			smax = a[1];
		}
		for (i = 3;i <= n;i++)
		{
			if (a[i] > max)
			{
				smax = max;
				max = a[i];
			}
			else if (a[i] <= max != 0 && a[i]> smax)
			{
				smax = a[i];
			}
		}
		System.out.printf("%d\n%d",max,smax);
		return 0;
	}

}

