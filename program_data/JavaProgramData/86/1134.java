package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int m;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int time;
		int[] times = new int[a];
		int[][] jump = new int[30][30];
		for (i = 0;i < a;i++)
		{
			times[i] = 60;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					jump[i][j] = Integer.parseInt(tempVar3);
				}
			}
			for (k = 0;k < m;k++)
			{
				if (jump[i][k] >= times[i])
				{
					times[i] += 3;
				}
				else if (times[i] - jump[i][k] == 1)
				{
					times[i] += 2;
				}
				else if (times[i] - jump[i][k] == 2)
				{
					times[i] += 1;
				}
				times[i] -= 3;
			}
		}

		for (i = 0;i < a;i++)
		{
			System.out.printf("%d\n",times[i]);
		}
		return 0;
	}

}

