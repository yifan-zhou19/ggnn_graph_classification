package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int m;
		int timeCount;
		int numCount;
		int[] num = new int[60];
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (int i = 0; i < m; ++i)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i] = Integer.parseInt(tempVar3);
				}
			}
			timeCount = numCount = 0;
			for (int i = 0; i < m; ++i)
			{
				for (int j = numCount; j < num[i]; ++j)
				{
					if (timeCount >= 60)
					{
						break;
					}
					timeCount++;
					numCount++;
				}
				if (timeCount >= 60)
				{
					break;
				}
				timeCount += 3;
				//printf("i, timeCount, numCount: %d, %d, %d\n", i, timeCount, numCount);
			}
			for (; timeCount < 60; ++timeCount)
			{
				numCount++;
			}
			System.out.printf("%d\n", numCount);
		}

	}

}

