package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int[][] fail = new int[100][20];
		int n;
		int i = 0;
		int j = 1;
		int time = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				fail[i][0] = Integer.parseInt(tempVar2);
			}
			if (fail[i][0] != 0)
			{
				for (j = 1;j <= fail[i][0];j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						fail[i][j] = Integer.parseInt(tempVar3);
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			if (fail[i][0] == 0)
			{
				sum = 60;
			}
			else
			{
				j = 1;
				for (time = 1;time <= 60;time++)
				{
					if (sum == fail[i][j])
					{
						time += 2;
						j++;
					}
					else
					{
						sum++;
					}
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

