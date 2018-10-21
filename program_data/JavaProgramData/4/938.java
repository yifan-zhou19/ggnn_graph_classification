package <missing>;

public class GlobalMembers
{
	/*
	 * ??????????.cpp
	 *  Created on: 2012-12-14
	 *  Author: ???
	 */
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[150][150];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++)
		{ //??
			for (int j = 0;j < col;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int sum = 0;sum <= row + col - 2;sum++)
		{ //sum???????????????
			if (sum < col)
			{ //??????
				for (int i = 0;i < row && i <= sum;i++)
				{ //????0?????sum???????
					System.out.print((*(a + i) + (sum - i)));
					System.out.print("\n");
				}
			}
			else
			{ //???????
				for (int i = sum - col + 1;sum - i >= 0 && i < row;i++)
				{ //????sum-col+1??????col-1???????
					System.out.print((*(a + i) + (sum - i)));
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

