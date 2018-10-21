package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		int sum;
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i - 1][j - 1] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (sum = 0;sum <= col - 1;sum++)
		{
			for (i = 0;i <= row - 1;i++)
			{
				if (sum - i < 0)
				{
					break;
				}
				System.out.printf("%d\n",a[i][sum - i]);
			}
		}
		for (sum = col;sum <= col + row - 2;sum++)
		{
			for (i = sum - col + 1;i <= row - 1;i++)
			{
				if (sum - i < 0)
				{
					break;
				}
				System.out.printf("%d\n",a[i][sum - i]);
			}
		}

		return 0;
	}
}

