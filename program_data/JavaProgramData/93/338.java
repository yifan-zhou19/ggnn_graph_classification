package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % 3 == 0)
		{
			if (a % 5 == 0)
			{
				if (a % 7 == 0)
				{
					System.out.print("3 5 7");
					System.out.print("\n");
				}
				else
				{
					System.out.print("3 5");
					System.out.print("\n");
				}
			}
			else
			{
				if (a % 7 == 0)
				{
					System.out.print("3 7");
					System.out.print("\n");
				}
				else
				{
					System.out.print('3');
				}
			}
		}
		else
		{
			if (a % 5 == 0)
			{
				if (a % 7 == 0)
				{
					System.out.print("5 7");
					System.out.print("\n");
				}
				else
				{
					System.out.print('5');
					System.out.print("\n");
				}
			}
			else
			{
				if (a % 7 == 0)
				{
					System.out.print('7');
					System.out.print("\n");
				}
				else
				{
					System.out.print('n');
					System.out.print("\n");
				}
			}
		}
	return 0;
	}

}

