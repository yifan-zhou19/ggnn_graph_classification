package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int aaa = 0;

		int num;

		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (num % 3 == 0)
		{
				System.out.print(3);
				aaa = 3;
		}
		if (num % 5 == 0)
		{
				if (aaa != 0)
				{
					System.out.print(" ");
				}
				System.out.print(5);
				aaa = 5;
		}
		if (num % 7 == 0)
		{
				if (aaa != 0)
				{
					System.out.print(" ");
				}
				System.out.print(7);
				aaa = 7;
		}

	   if (aaa == 0)
	   {
			System.out.print("n");
			System.out.print("\n");
	   }

		return 0;
	}
}

