package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n = 0;
		int i = 0;
		int j = 0;
		int col_num = 0;
		int row_num;
		int[][] In = new int[9][9];
		int[][] Out = new int[9][9];
		int[][] Temp = new int[9][9];
		int[][] around =
		{
			{1, 0},
			{-1, 0},
			{0, 1},
			{0, -1},
			{1, 1},
			{1, -1},
			{-1, 1},
			{-1, -1}
		};
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
		In[4][4] = m;
		for (i = 0;i < n;i++)
		{
			if (i != 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
				memcpy(In,Out,81 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(Out,0,81 * (Integer.SIZE / Byte.SIZE));
			}
			for (row_num = 4 - i;row_num <= 4 + i;row_num++)
			{
				for (col_num = 4 - i;col_num <= 4 + i;col_num++)
				{
					Out[row_num][col_num] = Out[row_num][col_num] + 2 * In[row_num][col_num];
					for (j = 0;j < 8;j++)
					{
						Out[row_num + around[j][0]][col_num + around[j][1]] = Out[row_num + around[j][0]][col_num + around[j][1]] + In[row_num][col_num];
					}
				}
			}
		}
		for (row_num = 0;row_num < 9;row_num++)
		{
			for (col_num = 0;col_num < 9;col_num++)
			{
				if (col_num != 8)
				{
					System.out.printf("%d ",Out[row_num][col_num]);
				}
				else
				{
					System.out.printf("%d\n",Out[row_num][col_num]);
				}
			}
		}
	}

}

