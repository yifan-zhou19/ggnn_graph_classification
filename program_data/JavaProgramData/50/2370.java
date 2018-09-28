package <missing>;

public class GlobalMembers
{
	//******************************
	//**?????******************
	//**??? 1300012728***********
	//**2013.10.13******************
	public static int Main()
	{
		int w; // ????????
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int day = 12; // ?????????13??????

		// ????????? 
		for (int i = 1; i <= 12; i++)
		{
			if ((w + day) % 7 == 5) // ????????i
			{
				System.out.print(i);
				System.out.print("\n");
			}
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				day += 31; //  ?????31????31
			}
			else if (i == 2) // ???2????28
			{
				day += 28;
			}
			else // ??????30
			{
				day += 30;
			}
		}
		return 0;
	}
}

