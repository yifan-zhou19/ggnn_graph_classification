package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int cow;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			cow = Integer.parseInt(tempVar2);
		}
		int[][] array = new int[row][cow];
		for (int i = 0;i < row;i++)
		{
			for (int k = 0;k < cow;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		int time = 0;
		for (int i = 0;i < 100;i++)
		{
			for (int m = i;m < cow - i;m++)
			{
				System.out.printf("%d\n",array[i][m]);
				time++;
			}
			if (time == row * cow)
			{
				break;
			}
			for (int n = i + 1;n < row - i;n++)
			{
				System.out.printf("%d\n",array[n][cow - i - 1]);
				time++;
			}
			if (time == row * cow)
			{
				break;
			}
			for (int j = cow - 2 - i;j >= i;j--)
			{
				System.out.printf("%d\n",array[row - i - 1][j]);
				time++;
			}
			if (time == row * cow)
			{
				break;
			}
			for (int l = row - 2 - i;l >= i + 1;l--)
			{
				System.out.printf("%d\n",array[l][i]);
				time++;
			}
			if (time == row * cow)
			{
				break;
			}
		}
	  return 0;
	}



}

