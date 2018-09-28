package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int number; //?????
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (number != 1)
		{
			if (number % 2 != 0)
			{
				System.out.print(number);
				System.out.print("*3+1=");
				number = number * 3 + 1;
				System.out.print(number);
				System.out.print("\n");
			}
			else
			{
				System.out.print(number);
				System.out.print("/2=");
				number = number / 2;
				System.out.print(number);
				System.out.print("\n");
			}
		}
		System.out.print("End");
		return 0;
	}
}

