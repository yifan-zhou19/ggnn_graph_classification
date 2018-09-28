package <missing>;

public class GlobalMembers
{
	/************************************
	1.cpp
	???2011-11-23
	??(11.8) ????????
	?? 1100012886
	************************************/

	//??????????????????
	public static int Main()
	{
		int i;
		int j;
		int i1;
		int j1;
		int n;
		int n1 = 0;
		int m;
		int[][] sperm = new int[9][9]; //??????????????????????????????????
		int[][] temp = new int[9][9];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sperm[4][4] = m;
		do
		{
			n1++; //n1?????
			for (i = 0; i <= 8; i++)
			{
				for (j = 0; j <= 8; j++)
				{
					temp[i][j] = 0;
				}
			} //?temp????
			for (i = 5 - n1; i <= 3 + n1; i++)
			{
				for (j = 5 - n1; j <= 3 + n1; j++)
				{
					//?????????????n1??????
					for (i1 = i - 1; i1 <= i + 1; i1++)
					{
						for (j1 = j - 1; j1 <= j + 1; j1++)
						{
							temp[i1][j1] = temp[i1][j1] + sperm[i][j]; //?????????temp
						}
					}
				}
			}
			for (i = 0; i <= 8; i++)
			{
				for (j = 0; j <= 8; j++)
				{
					sperm[i][j] = sperm[i][j] + temp[i][j];
				}
			} //??
		} while (n1 < n);
		for (i = 0; i <= 8; i++)
		{
			for (j = 0; j <= 8; j++)
			{
				System.out.print(sperm[i][j]);
				if (j < 8)
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		} //??
		return 0;
	}

}

