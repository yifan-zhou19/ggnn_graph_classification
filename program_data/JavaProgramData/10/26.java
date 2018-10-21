package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] height = new int[50];
		int[] flag = new int[50];
		int max;
		int i;
		int j;
		int num;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}

		for (i = 0; i < num; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				height[i] = Integer.parseInt(tempVar2);
			}
			flag[i] = 1;
		}
		for (i = 0; i < num; i++)
		{
			for (j = 0; j < i; j++)
			{
				if (height[j] >= height[i])
				{
					if (flag[j] + 1 > flag[i])
					{
						flag[i] = flag[j] + 1;
					}
				}
			}
		}

		max = flag[0];
		for (i = 1; i < num; i++)
		{
			if (flag[i] > max)
			{
				max = flag[i];
			}
		}
		System.out.printf("%d\n",max);
		return 0;
	}

}

