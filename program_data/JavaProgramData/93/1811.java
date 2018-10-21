package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n % 105 == 0)
			{
				System.out.print("3 5 7");
				System.out.print("\n");
			}
			else if (n % 15 == 0 || n % 21 == 0 || n % 35 == 0)
			{
				if (n % 15 == 0)
				{
					System.out.print("3 5");
					System.out.print("\n");
				}
				else if (n % 21 == 0)
				{
					System.out.print("3 7");
					System.out.print("\n");
				}
				else
				{
					System.out.print("5 7");
					System.out.print("\n");
				}
			}
			else if (n % 3 == 0 || n % 5 == 0 || n % 7 == 0)
			{
				if (n % 3 == 0)
				{
					System.out.print("3");
					System.out.print("\n");
				}
				else if (n % 5 == 0)
				{
					System.out.print("5");
					System.out.print("\n");
				}
				else
				{
					System.out.print("7");
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print('n');
				System.out.print("\n");
			}
		}
		return 0;
	}
}

