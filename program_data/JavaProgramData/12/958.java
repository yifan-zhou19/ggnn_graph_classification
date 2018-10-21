package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int count = 0;
		int row;
		int[][] arr = new int[100][100];
		int[] n = new int[100];
		int[] b = new int[100];
		for (i = 0;i < 100;i++)
		{
			count = 0;
			for (j = 0;j < 100;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					arr[i][j] = Integer.parseInt(tempVar);
				}
				if (arr[i][j] == 0 || arr[i][j] == -1)
				{
					n[i] = count;
					break;
				}
				count++;
			}
			if (arr[i][j] == -1)
			{
				row = i; //last row=-1, n[i]=0
				break;
			}
		}

		for (i = 0;i < row;i++)
		{
			count = 0;
			for (j = 0;j < n[i];j++)
			{
				for (k = j + 1;k < n[i];k++)
				{
							if (arr[i][j] == (arr[i][k] * 2) || (arr[i][j] * 2) == arr[i][k])
							{
						count++;
							}
				}
			}
			b[i] = count;
		}
		for (i = 0;i < row;i++)
		{
			System.out.printf("\n%d",b[i]);
		}
		return 0;
	}
}

