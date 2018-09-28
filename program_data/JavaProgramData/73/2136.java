package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[6][6];
		int[] max = new int[6];
		for (int i = 1;i <= 5;i++)
		{
			for (int j = 1;j <= 5;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (array[i][j] > array[i][max[i]])
				{
					max[i] = j;
				}
			}
		}
		int have = 0;
		int result = 0;
		for (int i = 1;i <= 5;i++)
		{
			int flag = 1;
			for (int k = 1;k <= 5;k++)
			{
				if (array[k][max[i]] < array[i][max[i]])
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				have = 1;
				System.out.print(i);
				System.out.print(" ");
				System.out.print(max[i]);
				System.out.print(" ");
				System.out.print(array[i][max[i]]);
				System.out.print("\n");
			}
		}
		if (have == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

