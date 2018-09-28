package <missing>;

public class GlobalMembers
{
	/*
	 * jisuanjuzhenbianyuan.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: qaj
	 */
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int z = 0;z < num;z++)
		{
			int a;
			int b;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] juzhen = new int[100][100];
			for (int i = 0;i < a;i++)
			{
				for (int j = 0;j < b;j++)
				{
					juzhen[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int sum = 0;
			for (int i = 0;i < b;i++)
			{
				sum = sum + juzhen[0][i];
			}
			for (int j = 1;j < a - 1;j++)
			{
				sum = sum + juzhen[j][0];
				sum = sum + juzhen[j][b - 1];
			}
			for (int i = 0;i < b;i++)
			{
				sum = sum + juzhen[a - 1][i];
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;

	}

}

