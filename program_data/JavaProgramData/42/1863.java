package <missing>;

public class GlobalMembers
{
	//*****************************************
	//* ??????????? **
	//* ?????? 1300012741 **
	//* ???2013.10.30 **
	//*****************************************


	public static int Main()
	{
		int[] list = new int[100000];
		int i; // ????????????????????
		int num;
		int target;
		int space_check = 0; // ????????

		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < num; i++) // ????
		{
			list[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		target = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < num; i++) // ??????
		{
			if (target != list[i]) // ?????
			{
				if (space_check != 0) // ????
				{
					System.out.print(" ");
				}
				else
				{
					space_check = 1;
				}
				System.out.print(list[i]);
			}
		}

		return 0;
	}
}

