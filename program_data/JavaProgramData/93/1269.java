package <missing>;

public class GlobalMembers
{
	//************************************************************
	//* ???????3?5?7????.cpp                        *
	//* ??????????????????3?5?7??          *
	//* ?    ?????                                         *
	//* ?    ??2013.9.29                                      *
	//************************************************************
	public static int Main()
	{
		int num;

		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (num % 3 == 0)
		{
			if (num % 5 == 0 || num % 7 == 0)
			{
				System.out.print(3);
				System.out.print(" ");
				if (num % 5 == 0 && num % 7 == 0)
				{
					System.out.print(5);
					System.out.print(" ");
					System.out.print(7);
					System.out.print("\n");
				}
				else
				{
					if (num % 5 == 0 && num % 7 != 0)
					{
						System.out.print(5);
						System.out.print("\n");
					}
					else
					{
						System.out.print(7);
						System.out.print("\n");
					}
				}
			}
			if (num % 5 != 0 && num % 7 != 0)
			{
				System.out.print(3);
				System.out.print("\n");
			}
		}
		else
		{
			if (num % 5 == 0 || num % 7 == 0)
			{
				if (num % 5 == 0 && num % 7 == 0)
				{
					System.out.print(5);
					System.out.print(" ");
					System.out.print(7);
					System.out.print("\n");
				}
				else
				{
					if (num % 5 == 0 && num % 7 != 0)
					{
						System.out.print(5);
						System.out.print("\n");
					}
					else
					{
						System.out.print(7);
						System.out.print("\n");
					}
				}
			}
			else
			{
				System.out.print("n");
				System.out.print("\n");
			}
		}

		return 0;
	}

}

