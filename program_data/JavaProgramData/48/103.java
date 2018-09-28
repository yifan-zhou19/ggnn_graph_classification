package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] field = new int[11][11];
		int[][] field1 = new int[11][11];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(field,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(field1,0,(Integer.SIZE / Byte.SIZE));
		int n = 0;
		int m = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int count = 1;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		field1[5][5] = m;
		while (count <= n)
		{
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
					field[i][j] = 2 * field1[i][j] + field1[i - 1][j] + field1[i + 1][j] + field1[i][j + 1] + field1[i][j - 1] + field1[i - 1][j - 1] + field1[i - 1][j + 1] + field1[i + 1][j + 1] + field1[i + 1][j - 1];
				}
			}
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
					field1[i][j] = field[i][j];
				}
			}
			count++;
		}
		for (i = 1;i < 10;i++)
		{
			System.out.print(field[i][1]);
			for (j = 2;j < 10;j++)
			{
				System.out.print(" ");
				System.out.print(field[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

