package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(array,0,(Integer.SIZE / Byte.SIZE));
		int i;
		int j;
		int k;
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 0;k < row + col - 1;k++)
		{
			for (i = 0;i < row;i++)
			{
				for (j = 0;j < col;j++)
				{
					if (i + j == k)
					{
						System.out.print(array[i][j]);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}








}

