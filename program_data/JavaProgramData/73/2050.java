package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[6][6];
		int[] max_hang = new int[6];
		int[] min_lie = new int[6];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(max_hang,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(min_lie,1,(Integer.SIZE / Byte.SIZE));
		int i;
		int j;
		for (i = 1;i <= 5;i++)
		{
		for (j = 1;j <= 5;j++)
		{
		num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}
		for (i = 1;i <= 5;i++)
		{
		for (j = 1;j <= 5;j++)
		{
			if (num[i][j] > max_hang[i])
			{
				max_hang[i] = num[i][j];
			}
			if (num[i][j] < min_lie[j])
			{
				min_lie[j] = num[i][j];
			}
		}
		}
		for (i = 1;i <= 5;i++)
		{
		for (j = 1;j <= 5;j++)
		{
			if (num[i][j] == max_hang[i] && num[i][j] == min_lie[j])
			{
				System.out.print(i);
				System.out.print(' ');
				System.out.print(j);
				System.out.print(' ');
				System.out.print(num[i][j]);
				System.out.print("\n");
				return 0;
			}
		}
		}
		System.out.print("not found");
	}

}

