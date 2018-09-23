package <missing>;

public class GlobalMembers
{
	// ??????????????????
	// ??????i???,?????i??????????????
	// maxC[i] = max{maxC[k]|1<=k<i?height[k]<height[i]} + 1
	public static int Main()
	{
		// height[i]??????i??????
		// maxC[i]??????????i?????????????,?????????????
		int k;
		int[] height = new int[25];
		int[] maxC = new int[25];
		int j;
		int i;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				height[i] = Integer.parseInt(tempVar2);
			}
			// maxC[i] = max{maxC[k]|1<=k<i?height[k]<height[i]} + 1
			for (j = 0,max = 0;j < i;j++)
			{
				if (height[j] >= height[i])
				{
					if (maxC[j] > max)
					{
						max = maxC[j];
					}
				}
			}
			if (max == 0)
			{
				maxC[i] = 1;
			}
			else
			{
				maxC[i] = ++max;
			}
		}

		for (i = 1,max = 0;i < k;i++)
		{
			if (maxC[i] > max)
			{
				max = maxC[i];
			}
		}

		System.out.printf("%d\n",max);

		return 0;
	}
}

