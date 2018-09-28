package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int max1;
		int max2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		max1 = -99999;
		max2 = -99999;
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] > max1)
			{
				max1 = a[i];
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] > max2 && a[i] < max1)
			{
				max2 = a[i];
			}
		}
		System.out.printf("%d\n%d",max1,max2);
	}
}

