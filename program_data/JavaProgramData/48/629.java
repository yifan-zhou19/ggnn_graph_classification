package <missing>;

public class GlobalMembers
{
	//********************
	//**????????**
	//**?? 1100012915***
	//********11.28*******
	//********************

	public static int m;
	public static int n;
	public static int i;
	public static int j;

	public static int bac(int day, int i, int j)
	{
		if ((day == 0) && (i == 5) && (j == 5)) //?0? ?????????m?
		{
			return m;
		}
		else if ((i >= 5 - day) && (i <= 5 + day) && (j >= 5 - day) && (j <= 5 + day)) //?day? ??????? ??????????????????????
		{
			return (bac(day - 1, i - 1, j - 1) + bac(day - 1, i - 1, j) + bac(day - 1, i - 1, j + 1) + bac(day - 1, i, j - 1) + bac(day - 1, i, j + 1) + bac(day - 1, i + 1, j - 1) + bac(day - 1, i + 1, j) + bac(day - 1, i + 1, j + 1) + 2 * bac(day - 1, i, j));
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 8; j++)
			{
				System.out.print(bac(n, i, j));
				System.out.print(" ");
			}
			System.out.print(bac(n, i, 9));
			System.out.print("\n");
		}
		return 0;
	}

}

