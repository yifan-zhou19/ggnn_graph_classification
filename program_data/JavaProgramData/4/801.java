package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] array = new int[110][110];
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
		int i;
		int j;
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
		for (i = 0;i < col;i++) //???
		{
			for (j = 0;((j <= i) && (j < row));j++) //????
			{
				System.out.printf("%d\n",*(*(array + j) + i - j)); //????
			}
		}
		for (i = 1;i < row;i++) //?
		{
			for (j = 0;((j <= col - 1) && (j < row - i));j++) //????
			{
				System.out.printf("%d\n",*(*(array + i + j) + col - 1 - j)); //????
			}
		}
		return 0;
	}
}

