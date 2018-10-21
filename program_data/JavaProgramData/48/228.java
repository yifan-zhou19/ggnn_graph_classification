package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[][] count = new int[9][9];
		int[][] temp = new int[9][9];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(count,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(temp,0,(Integer.SIZE / Byte.SIZE));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		count[4][4] = m;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < 9; j++)
			{
				for (k = 0; k < 9;k++)
				{
					if (count[j][k] != 0)
					{
						temp[j - 1][k] += count[j][k];
						temp[j + 1][k] += count[j][k];
						temp[j - 1][k - 1] += count[j][k];
						temp[j - 1][k + 1] += count[j][k];
						temp[j][k - 1] += count[j][k];
						temp[j][k + 1] += count[j][k];
						temp[j + 1][k + 1] += count[j][k];
						temp[j + 1][k - 1] += count[j][k];
						temp[j][k] += count[j][k] * 2;
					}
				}
			}
			for (j = 0; j < 9; j++)
			{
				for (k = 0; k < 9;k++)
				{
					count[j][k] = temp[j][k];
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(temp,0,(Integer.SIZE / Byte.SIZE));
		}
		for (j = 0; j < 9; j++)
		{
			for (k = 0; k < 8;k++)
			{
				System.out.print(count[j][k]);
				System.out.print(' ');
			}
			System.out.print(count[j][8]);
			System.out.print("\n");
		}
		return 0;
	}
}

