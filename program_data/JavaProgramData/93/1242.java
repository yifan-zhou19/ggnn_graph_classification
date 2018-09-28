package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????3?5?7????   **
	//*?????? 1300012861 **
	//*???2013.9.26  **
	//********************************
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = (n % 3 == 0);
		b = (n % 5 == 0);
		c = (n % 7 == 0);
		if (a + b + c == 0)
		{
			System.out.print("n");
			System.out.print("\n");
		}
		else
		{
			if (a + b + c == 3)
			{
				System.out.print("3 5 7");
				System.out.print("\n");
			}
			else
			{
				if (a == 1 && b == 0 && c == 0)
				{
					System.out.print("3");
					System.out.print("\n");
				}
				else
				{
					if (a == 0 && b == 1 && c == 0)
					{
						System.out.print("5");
						System.out.print("\n");
					}
					else
					{
						if (a == 0 && b == 0 && c == 1)
						{
							System.out.print("7");
							System.out.print("\n");
						}
						else
						{
							if (a == 1 && b == 1 && c == 0)
							{
								System.out.print("3 5");
								System.out.print("\n");
							}
							else
							{
								if (a == 0 && b == 1 && c == 1)
								{
									System.out.print("5 7");
									System.out.print("\n");
								}
								else
								{
									System.out.print("3 7");
									System.out.print("\n");
								}
							}
						}
					}
				}
			}
		}
		return 0;
	}
}

