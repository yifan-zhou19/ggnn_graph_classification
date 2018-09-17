package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int max = 0;
		int[][] num = new int[25][2];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (count = 0;count < k;++count)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[count][0] = Integer.parseInt(tempVar2);
			}
			num[count][1] = 0;
		}
		for (count1 = 0;count1 < k;++count1)
		{
			max = 0;
			for (count2 = 0;count2 < count1;++count2)
			{
				if (num[count2][1] >= max != 0 && num[count2][0] >= num[count1][0])
				{
					max = num[count2][1];
					num[count1][1] = max + 1;
				}
			}
		}
		max = 0;
		for (count = 0;count < k;++count)
		{
			if (num[count][1] >= max)
			{
				max = num[count][1];
			}
		}
		System.out.printf("%d",max + 1);
	}
}

