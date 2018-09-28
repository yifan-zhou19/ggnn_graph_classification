package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int number = 0;
		int x = 0;
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (number != 1) //??while?????1????
		{
			if (number % 2 == 1) //??????
			{
				x = number;
				number = number * 3 + 1;
				System.out.print(x);
				System.out.print("*3+1=");
				System.out.print(number);
				System.out.print("\n");
			}
			else //??????
			{
				x = number;
				number = number / 2;
				System.out.print(x);
				System.out.print("/2=");
				System.out.print(number);
				System.out.print("\n");
			}
		}
		System.out.print("End");

		return 0;
	}
}

