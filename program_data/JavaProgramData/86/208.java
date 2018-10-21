package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int stu_num;
		int stop_num;
		int i;
		int j;
		int[][] stop = new int[100][100];
		int[] sum = new int[100];
		int[][] time = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			stu_num = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= stu_num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stop_num = Integer.parseInt(tempVar2);
			}
			if (stop_num == 0)
			{
				sum[i] = 60;
			}
			else
			{
				for (j = 1;j <= stop_num;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						stop[i][j] = Integer.parseInt(tempVar3);
					}
				}
				for (j = stop_num;j >= 1;j--)
				{
					time[i][j] = stop[i][j] + (j - 1) * 3;
					if (time[i][j] > 60)
					{
						continue;
					}
					else if (time[i][j] <= 57)
					{
						sum[i] = 60 - 3 * j;
					}
					else
					{
						sum[i] = time[i][j] - 3 * (j - 1);
					}
					break;
				}
			}
		}
		for (i = 1;i <= stu_num;i++)
		{
			System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}

}

