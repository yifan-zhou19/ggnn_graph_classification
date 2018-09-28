package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *array[100][100];
		int[][] array = new int[100][100];
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
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					*(array + i) + j = tempVar3;
				}
			}
		}
		for (k = 0;k <= row + col;k++)
		{
			for (i = 0;i < row;i++)
			{
				for (j = 0;j < col;j++)
				{
					if (i + j == k)
					{
						System.out.printf("%d\n",*(*(array + i) + j));
					}
				}
			}
		}
	}


}

