package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] n = new int[1000][1000];
		int num;
		int i;
		int j;
		int sta_r;
		int sta_c;
		int end_r;
		int end_c;
		int S;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			for (j = 0;j < num;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					n[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < num;i++)
		{
			if (n[i][0] == 0)
			{
				sta_r = i;
				sta_c = 0;
			}
		}
		for (j = 0;j < num;j++)
		{
			if (n[0][j] == 0)
			{
				sta_r = 0;
				sta_c = j;
			}
		}
		for (i = 0;i < num;i++)
		{
			if (n[i][num - 1] == 0)
			{
				end_r = i;
				end_c = num - 1;
			}
		}
		for (j = 0;j < num;j++)
		{
			if (n[num - 1][j] == 0)
			{
				sta_r = num - 1;
				sta_c = j;
			}
		}
		for (i = 1;i < num - 1;i++)
		{
			for (j = 1;j < num - 1;j++)
			{
				if ((n[i][j] == 0) && (n[i + 1][j] == 0) && (n[i][j + 1] == 0))
				{
					sta_r = i;
					sta_c = j;
				}
				if ((n[i][j] == 0) && (n[i - 1][j] == 0) && (n[i][j - 1] == 0))
				{
					end_r = i;
					end_c = j;
				}

			}
		}
		S = (end_r - sta_r - 1) * (end_c - sta_r - 1);
		System.out.printf("%d",S);
		return 0;
	}
}

