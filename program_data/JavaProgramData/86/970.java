package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] rope = new int[Number_children][Number];
		int i;
		int j;
		int sum;
		int time;
		int tmp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < Number;j++)
			{
				rope[i][j] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				rope[i][0] = Integer.parseInt(tempVar2);
			}
			for (j = 1;j < 1 + rope[i][0];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					rope[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1, sum = 0, time = 0, tmp = 1;(time <= 60) && (j <= rope[i][0]);j++)
			{
				if ((rope[i][1] == 0) || (rope[i][1] >= 60))
				{
					System.out.printf("%d\n",60);
					tmp = 0;
					break;
				}
				sum = rope[i][j];
				time = rope[i][j] + 3 * j;
			}
			if (tmp == 0)
			{
				continue;
			}
			else
			{
			if (time < 60)
			{
				sum = sum + 60 - time;
				System.out.printf("%d\n",sum);
				continue;
			}
			if (time > 63)
			{
			sum = 60 - (j - 2) * 3;
			System.out.printf("%d\n",sum);
			continue;
			}
			sum = 60 - (j - 2) * 3 - (3 - (time-60));
			System.out.printf("%d\n",sum);
			}
		}
		return 0;
	}

}

