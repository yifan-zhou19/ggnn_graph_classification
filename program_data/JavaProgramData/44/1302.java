package <missing>;

public class GlobalMembers
{
	public static void reverse(int number) //????????
	{
		int result = 0;
		if (number > 0 && number < 10) //????number??????????????
		{
			System.out.print(number);
		}
		else if (number >= 10) //????number?????????????
		{
			System.out.print((number % 10));
			number = number / 10;
			reverse(number);
		}
	}


	public static int Main()
	{
		int number = 0;
		int i = 0;
		for (i = 0;i < 6;i++)
		{
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (number == 0) //?????????????
			{
				System.out.print(number);
				System.out.print("\n");
			}
			else if (number > 0)
			{
				while (number % 10 == 0) //??number?????0
				{
				  number = number / 10;
				}
				reverse(number);
				System.out.print("\n");
			}
			else if (number < 0)
			{
				number = number * (-1);
				System.out.print("-");
				while (number % 10 == 0) //??number?????0
				{
				  number = number / 10;
				}
				reverse(number);
				System.out.print("\n");
			}
		}
		return 0;
	}


}

