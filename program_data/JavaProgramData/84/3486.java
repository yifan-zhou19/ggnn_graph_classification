package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int i;
		int n;
		int max;
		int max2;
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
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (max <= a[i])
			{
				max = a[i];
			}
		}
		max2 = 0;
		for (i = 0;i < n;i++)
		{
			if ((a[i] < max) && (a[i] >= max2))
			{
				max2 = a[i];
			}
		}
		System.out.printf("%d\n%d\n",max,max2);
		return 0;
	}
}

