package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x % 3 == 0)
		{
			System.out.print(3);
			if (x % 5 == 0)
			{
				System.out.print(" ");
				System.out.print(5);
			}
			if (x % 7 == 0)
			{
				System.out.print(" ");
				System.out.print(7);
			}
		}
		else if (x % 5 == 0)
		{
			  System.out.print(5);
			if (x % 7 == 0)
			{
				System.out.print(" ");
				System.out.print(7);
			}
		}
			else if (x % 7 == 0)
			{
				System.out.print(7);
			}
		else
		{
			System.out.print("n");
		}
		return 0;
	}
}

