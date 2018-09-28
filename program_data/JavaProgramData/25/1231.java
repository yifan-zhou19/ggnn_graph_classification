package <missing>;

public class GlobalMembers
{
	//*****************************************
	//* ?????2?N?? **
	//* ?????? 1300012741 **
	//* ???2013.10.30 **
	//*****************************************


	public static int Main()
	{
		char[] number = {2, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}; // ????
		int i; // ??????????
		int j;
		int N;

		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (N == 0) // ???????
		{
			System.out.print(1);
			return 0;
		}

		for (i = 0; i < N - 1; i++)
		{
			for (j = 0; j < 50; j++) // ????
			{
				number[j] *= 2;
			}
			for (j = 0; j < 50; j++) // ????
			{
				number[j + 1] += number[j] / 10;
				number[j] -= number[j] / 10 * 10;
			}
		}
		for (j = 49; j >= 0; j--) // ??????
		{
			if (number[j] != 0)
			{
				break;
			}
		}
		for (i = j; i >= 0; i--) // ??????????
		{
			System.out.printf("%d", number[i]);
		}

		return 0;
	}
}

