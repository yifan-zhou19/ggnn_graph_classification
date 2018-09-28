package <missing>;

public class GlobalMembers
{
	//*****************************************
	//* ??????? **
	//* ??? 1300012741 **
	//* ???2013.9.25 **
	//*****************************************


	public static int Main()
	{
		int num; // ????????
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0; // ??????

		if (num % 3 == 0)
		{
			System.out.print("3");
			sum++;
		}
		if (num % 5 == 0)
		{
			if (sum != 0)
			{
				System.out.print(" ");
			}
			System.out.print("5");
			sum++;
		}
		if (num % 7 == 0)
		{
			if (sum != 0)
			{
				System.out.print(" ");
			}
			System.out.print("7");
			sum++;
		}
		if (sum == 0)
		{
			System.out.print("n");
		}

		return 0;
	}

}

