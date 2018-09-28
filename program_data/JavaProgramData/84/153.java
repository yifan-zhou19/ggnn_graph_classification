package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int max;
		int max2;
		int j;
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
				a[i - 1] = Integer.parseInt(tempVar2);
			}
		}
		max = a[0];
		max2 = a[0];
		for (i = 2;i <= n;i++)
		{
			if (max <= a[i - 1])
			{
				max = a[i - 1];
			j = i;
			}

		}
		for (i = 2;i <= n;i++)
		{
			if (i == j)
			{
				continue;
			}
			else if (max2 <= a[i - 1])
			{
				max2 = a[i - 1];
			}

		}
		System.out.printf("%d\n%d",max,max2);

		return 0;
	}

}

