package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{

		return num % 10;

	}
	public static int Main()
	{
		int number;
		while ((number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (number > 0)
			{
			while (reverse(number) == 0)
			{
				number = number / 10;
			}
			while (number != 0)
			{
			   System.out.print(reverse(number));
			   number = number / 10;
			}
		   System.out.print("\n");
			}
		else if (number < 0)
		{
			System.out.print('-');
			number = 0 - number;
			while (reverse(number) == 0)
			{
				number = number / 10;
			}
			while (number != 0)
			{
			System.out.print(reverse(number));
			number = number / 10;
			}
		  System.out.print("\n");
		}
		else if (number == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		}

		return 0;

	}

}

