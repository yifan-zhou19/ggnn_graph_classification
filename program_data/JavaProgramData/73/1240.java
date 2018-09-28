package <missing>;

public class GlobalMembers
{
	/*
	 * 11.cpp
	 *
	 *  Created on: 2011-11-4
	 *      Author: 11095
	 */

	public static int Main()
	{
		int[][] jz = new int[5][5];
		int i;
		int j;
		int I;
		int J;
		int p = 0;
		int max;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				jz[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0;i < 5;i++)
		{
			max = jz[i][0];
			I = i;
			J = 0;
			for (j = 1;j < 5;j++)
			{
				if (max < jz[i][j])
				{
					max = jz[i][j];
					I = i;
					J = j;
				}
			}
			if (max <= jz[0][J] != 0 && max <= jz[1][J] != 0 && max <= jz[2][J] != 0 && max <= jz[3][J] != 0 && max <= jz[4][J])
			{
				I = I + 1;
				J = J + 1;
				p = 1;
				System.out.print(I);
				System.out.print(" ");
				System.out.print(J);
				System.out.print(" ");
				System.out.print(max);
			}
		}

		if (p == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}

}

