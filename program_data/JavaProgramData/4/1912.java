package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int row;
		int col;
		int[] matrix = new int[100 * 100];
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
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					matrix + i * 100 + j = tempVar3;
				}
			}
		}
		for (i = 0; i < col; i++)
		{
			for (j = i, k = 0; j >= 0 && k < row; j--, k++)
			{
				System.out.printf("%d\n", matrix[k * 100 + j]);
			}
		}
		for (i = 1; i < row; i++)
		{
			for (j = col - 1, k = i; j >= 0 && k < row; j--, k++)
			{
				System.out.printf("%d\n", matrix[k * 100 + j]);
			}
		}
		return 0;
	}
}

