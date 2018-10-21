package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????            **
	//*?????? 1200012839    **
	//*???2012.11.12          **
	//********************************

	public static int Main() //???
	{
		int jun1;
		int[] month = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		jun1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= 12; i++)
		{
			if (((month[i] + 12) % 7 + jun1) % 7 == 5)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}

		return 0;
	}
}

