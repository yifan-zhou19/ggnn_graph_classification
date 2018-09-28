package <missing>;

public class GlobalMembers
{
	//*****************************************
	//* ???????? **
	//* ?????? 1300012741 **
	//* ???2013.9.25 **
	//*****************************************


	public static int Main()
	{
		int i; // ???????????
		int num;
		double origin; // ??????????????????????
		double better;
		double origin_temp;
		double better_temp;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		origin = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		better = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

		for (i = 1; i < num; i++) // ??????-1?
		{
			origin_temp = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			better_temp = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (better / origin - better_temp / origin_temp > 0.05) // ????
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else if (better_temp / origin_temp - better / origin > 0.05) //????
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else // ?????
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}

		return 0;
	}

}

