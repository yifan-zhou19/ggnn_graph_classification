package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int max;
		int[] a = new int[30];
		int[] limit = new int[30];
		int[] num = new int[30];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = k - 1;i >= 0;i--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		num[0] = 1;
		limit[0] = a[0];
		for (i = 1;i < k;i++)
		{
			max = 1;
			for (j = 0;j < i;j++)
			{
				if ((a[i] >= limit[j]) && ((num[j] + 1) >= max))
				{
					max = num[j] + 1;
				}
			}
			limit[i] = a[i];
			num[i] = max;
		}
		max = 0;
		for (i = 0;i < k;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		System.out.printf("%d",max);
		return 0;
	}
}

