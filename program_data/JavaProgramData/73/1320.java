package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[5][5];
		int i;
		int j;
		int k;
		int n;
		int max;
		int[] flag = new int[5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			max = s[i][0];
			n = 0;
			for (j = 0;j < 5;j++)
			{
				if (s[i][j] > max)
				{
					max = s[i][j];
					n = j;
				}
			}
			flag[i] = 1;
			for (k = 0;k < 5;k++)
			{
				if (s[k][n] < s[i][n])
				{
					flag[i] = 0;
				}
			}
			if (flag[i] == 1)
			{
				System.out.printf("%d %d %d\n", i + 1, n + 1, max);
			}
		}
		if (flag[0] == 0 && flag[1] == 0 && flag[2] == 0 && flag[3] == 0 && flag[4] == 0)
		{
			System.out.print("not found");
		}

			return 0;
	}
}

