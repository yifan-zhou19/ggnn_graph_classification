package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int population;
		int m;
		int[] num = new int[10];
		int i;
		int j;
		int time = 0;
		int duandian = 1;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			population = Integer.parseInt(tempVar);
		}

		for (i = 0;i < population;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				System.out.print("60\n");
				continue;
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[j] = Integer.parseInt(tempVar3);
				}
			}
			time = num[m - 1] + 3 * m;
			if (time <= 60)
			{
				sum = 60 - 3 * m;
			}
			else
			{
				time = num[0] + 3;
				for (j = 1;j < m;j++)
				{
					time = time - num[j - 1] + num[j];
					if (time > 60)
					{
						sum = 60 - 3 * duandian;
						break;
					}
					time += 3;
					if (time >= 60)
					{
						sum = time-3 - 3 * duandian;
						break;
					}
					duandian++;
				}
			}
			System.out.printf("%d\n",sum);
			sum = 0;
			time = 0;
			duandian = 1;
		}
		return 0;
	}
}

