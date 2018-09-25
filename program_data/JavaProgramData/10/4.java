package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] height = new int[25];
		int[] amount = new int[25];
		int n;
		int i;
		int j;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				height[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			height[n - 1] = Integer.parseInt(tempVar3);
		}
		amount[n - 1] = 1;
		for (i = n - 2;i >= 0;i--)
		{
			max = 0;
			for (j = i;j < n;j++)
			{
				if (amount[j] > max && height[j] <= height[i])
				{
					max = amount[j];
				}
			}
			amount[i] = max + 1;
		}
		for (i = 0;i < n;i++)
		{
			if (amount[i] > max)
			{
				max = amount[i];
			}
		}
		System.out.printf("%d\n",max);
		return 0;
	}
}

