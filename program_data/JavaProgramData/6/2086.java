package <missing>;

public class GlobalMembers
{
	/*
	 * ?????????????? .cpp
	 * ?????
	 * ????: 2012-12-10
	 * ?????????????
	 */
	public static int Main()
	{ //?????
		int[][] a = new int[105][105]; //??????????
		int n = 0;
		int row = 0;
		int col = 0;
		int i = 0;
		int j = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{ //?n??????????
			row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < row;i++)
			{ //????
				for (j = 0;j < col;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (p = a[0][0];p < a[0][0] + col;p++)
			{ //?????
				sum = sum + *p;
			}
			for (i = 1;i < row - 1;i++)
			{ //???????????????????????
				sum = sum + a[i][0] + a[i][col - 1];
			}
			if (row > 1)
			{
				for (p = a[row - 1][0];p < a[row - 1][0] + col;p++)
				{ //?????
					sum = sum + *p;
				}
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0; //??
		}
		return 0;
	} //?????
}

