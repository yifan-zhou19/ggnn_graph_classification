package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int front_number_exist;
		front_number_exist = false;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x % 3 == 0)
		{
			front_number_exist = 1;
			System.out.print(3);
		}
		if (x % 5 == 0)
		{
			if (front_number_exist != 0)
			{
				System.out.print(" 5");
			}
			else
			{
				front_number_exist = 1;
				System.out.print("5");
			}
		}
		if (x % 7 == 0)
		{
			if (front_number_exist != 0)
			{
				System.out.print(" 7");
			}
			else
			{
				front_number_exist = 1;
				System.out.print("7");
			}
		}
		else
		{
			if (front_number_exist == 0)
			{
				System.out.print("n");
			}
		}
		return 0;
	}

}

