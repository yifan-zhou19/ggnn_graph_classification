package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] brea = new int[100];
		int[][] num = new int[100][100];
		int[] mark = new int[100];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				brea[i] = Integer.parseInt(tempVar2);
			}
			mark[i] = 60;
			for (j = 1;j <= brea[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i][j] = Integer.parseInt(tempVar3);
				}
				if (num[i][j] + j * 3 < 60)
				{
					mark[i] = 60 - j * 3;
				}
				if (num[i][j] + j * 3 == 61)
				{
					mark[i] = 61 - j * 3;
				}
				if (num[i][j] + j * 3 == 62)
				{
					mark[i] = 62 - j * 3;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%d\n", mark[i]);
		}
		return 0;
	}

}

