package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[100][100];
		int lefti = 0;
		int leftj = 0;
		int righti = 0;
		int rightj = 0;
		int number = 0;
		int n = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num, -1, 10000);
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					num[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (num[i][j] == 0 && num[i + 1][j] == 0 && num[i][j + 1] == 0)
				{
					lefti = i;
					leftj = j;
				}
				else if (num[i][j] == 0 && num[i - 1][j] == 0 && num[i][j - 1] == 0)
				{
					righti = i;
					rightj = j;
				}
			}
		}
		number = (rightj - leftj - 1) * (righti - lefti - 1);
		System.out.printf("%d\n", number);
		System.out.printf("%d %d %d %d", lefti, leftj, righti, rightj);
		return 0;
	}


}

