package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int[] data = new int[25];
		int[] ans = new int[25];
		int max;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 25;i++)
		{
			ans[i] = 1;
		}
		for (i = 1;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				data[i - 1] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			data[k - 1] = Integer.parseInt(tempVar3);
		}
		ans[0] = 1;
		max = 1;
		for (j = 1;j < k;j++)
		{
			for (i = 0;i < j;i++)
			{
				if (data[j] <= data[i])
				{
					if (ans[i] + 1 > ans[j])
					{
						ans[j] = ans[i] + 1;
					}
				}
			}
			if (ans[j] > max)
			{
				max = ans[j];
			}
		}
		System.out.printf("%d",max);
	}
}

