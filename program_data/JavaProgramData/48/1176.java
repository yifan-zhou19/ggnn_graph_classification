package <missing>;

public class GlobalMembers
{
	//****************************
	//**Title: ???????? **
	//**Author:???1300017687 **
	//**Date?2013.12.5         **
	//**File?2.cpp             **
	//****************************

	public static int first; //????????????
	public static int findbat(int i, int j, int days) //????????days??i?j???????
	{
		if ((i == -1) || (i == 9) || (j == -1) || (j == 9)) //??????
		{
			return 0; //????0
		}
		if (days == 0) //??days?0
		{
			if (i == 4 && j == 4) //???????
			{
				return first;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return findbat(i - 1, j - 1, days - 1) + findbat(i - 1, j, days - 1) + findbat(i - 1, j + 1, days - 1) + findbat(i, j - 1, days - 1) + 2 * findbat(i, j, days - 1) + findbat(i, j + 1, days - 1) + findbat(i + 1, j - 1, days - 1) + findbat(i + 1, j, days - 1) + findbat(i + 1, j + 1, days - 1); //????
		}
	}
	public static int Main()
	{
		int days; //??
		first = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		days = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0 ; i <= 8 ; i++) //?????????
		{
			System.out.print(findbat(i, 0, days));
			for (int j = 1; j <= 8 ; j++)
			{
				System.out.print(' ');
				System.out.print(findbat(i, j, days));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

