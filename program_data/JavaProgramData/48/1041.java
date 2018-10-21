package <missing>;

public class GlobalMembers
{
	//****************************
	//**Title:????????  **
	//**Author:?? 1300012732  **//Std: '56 280 728 1232 1456 1232 728 280 56'
								  // Out: '56 204 494 760 904 760 494 204 56'

								   //  Input of in case 0:
									 //    14 4
	//**Date?2013.11.4         **
	//**File?2.cpp             **
	//****************************
	public static int[][] dish = new int[11][11];
	public static int[][] die = new int[11][11];
	public static int[][] increase = new int[11][11];

	public static void breed(int day, int count)
	{
		int i;
		int j;
		if (count > day)
		{
			for (i = 1; i < 10; i++)
			{
				for (j = 1; j < 9; j++)
				{
					System.out.print(dish[i][j]);
					System.out.print(' ');
				}
				System.out.print(dish[i][9]);
				System.out.print("\n");
			}
			return;
		}
		else
		{
			for (i = 1; i < 10; i++)
			{
				for (j = 1; j < 10; j++)
				{
					if (dish[i][j] != 0)
					{
						increase[i][j] += 2 * dish[i][j];
						increase[i][j + 1] += dish[i][j];
						increase[i][j - 1] += dish[i][j];
						increase[i - 1][j] += dish[i][j];
						increase[i + 1][j] += dish[i][j];
						increase[i + 1][j - 1] += dish[i][j];
						increase[i + 1][j + 1] += dish[i][j];
						increase[i - 1][j - 1] += dish[i][j];
						increase[i - 1][j + 1] += dish[i][j];
					}
				}
			}
			for (i = 1; i < 10; i++)
			{
				for (j = 1; j < 10; j++)
				{
					dish[i][j] += increase[i][j];
					dish[i][j] -= die[i][j];
				}
			}
			for (i = 1; i < 10; i++)
			{
				for (j = 1; j < 10; j++)
				{
					die[i][j] = increase[i][j];
					increase[i][j] = 0;
				}
			}
			 breed(day, count + 1);
		}
	}

	public static int Main()
	{
		int num;
		int day;
		int i;
		int j;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < 11; i++)
		{
			for (j = 0; j < 11; j++)
			{
				dish[i][j] = die[i][j] = 0;
			}
		}
		dish[5][5] = die[5][5] = num;
		breed(day, 1);
		return 0;
	}



}

