package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int mm;
		int maxj;
		int i;
		int j;
		int k;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] height = new int[n];
		int[] amount = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				height[i] = Integer.parseInt(tempVar2);
			}
			amount[i] = 1;
		}
		max = 1;
			for (j = n - 1;j >= 0;j--)
			{
				maxj = 1;
				for (k = j + 1;k < n;k++)
				{

					if (height[j] >= height[k])
					{
						amount[j] = amount[k] + 1;
						if (amount[j] >= maxj)
						{
							maxj = amount[j];
						}
					}
				}
				amount[j] = maxj;
				if (maxj >= max)
				{
					max = maxj;
				}
			}
		System.out.printf("%d",max);
		return 0;
	}

}

