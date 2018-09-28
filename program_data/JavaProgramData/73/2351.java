package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[6][6];
		int i;
		int j;
		int flag1 = 1;
		int tmp1;
		int tmp2;
		int flagx = 0;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					array[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		i = 1;
		j = 1;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				flag1 = 1;

				for (tmp1 = 1;tmp1 <= 5;tmp1++)
				{
					if (array[i][j] < array[i][tmp1])
					{
						flag1 = 0;
					}
				}
				for (tmp2 = 1;tmp2 <= 5;tmp2++)
				{
					if (array[i][j] > array[tmp2][j])
					{
						flag1 = 0;
					}
				}
				if (flag1 == 1)
				{
					System.out.printf("%d %d %d",i,j,array[i][j]);
					flagx = 1;
				}
			}
		}
		if (flagx == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}






}

