package <missing>;

public class GlobalMembers
{
	/*
	 * xzsd.cpp
	 *
	 *  Created on: 2012-12-16
	 *      Author: patriciaxiao
	 */

	public static int Main()
	{
		int[][] height = new int[25][25];
		int[][] top = new int[25][25]; //?????
		int i;
		int j;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					height[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (top[i][j] == -1) //??????????
				{
					continue;
				}
				if (height[i][j] >= height[i - 1][j])
				{
					if (height[i][j] > height[i - 1][j])
					{
						top[i - 1][j] = -1;
					}
				}
				else
				{
					continue;
				}
				if (height[i][j] >= height[i + 1][j])
				{
					if (height[i][j] > height[i + 1][j])
					{
						top[i + 1][j] = -1;
					}
				}
				else
				{
					continue;
				}
				if (height[i][j] >= height[i][j - 1])
				{
					if (height[i][j] > height[i][j - 1])
					{
						top[i][j - 1] = -1;
					}
				}
				else
				{
					continue;
				}
				if (height[i][j] >= height[i][j + 1])
				{
					if (height[i][j] > height[i][j + 1])
					{
						top[i][j + 1] = -1;
					}
				}
				else
				{
					continue;
				}
				System.out.printf("%d %d\n",i - 1,j - 1);
			}
		}
		return 0;
	}

}

