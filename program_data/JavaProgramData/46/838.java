package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] input = new int[100][100];
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] output = new int[10000];
		int a = 0;
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					input[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = i;j < col - i;j++)
			{
				output[a++] = input[i][j];
			}
			for (k = i + 1;k < row - i;k++)
			{
				output[a++] = input[k][j - 1];
			}
			for (m = j - 2;m >= i;m--)
			{
				output[a++] = input[k - 1][m];
			}
			for (n = k - 2;n > i;n--)
			{
				output[a++] = input[n][m + 1];
			}
			if (i == k)
			{
				break;
			}
		}
		for (i = 0;i < row * col - 1;i++)
		{
			System.out.printf("%d\n",output[i]);
		}
		System.out.printf("%d",output[row * col - 1]);
		return 0;
	}
}

