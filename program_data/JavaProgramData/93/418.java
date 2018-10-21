package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int b = 0; //b?c?d???a??3?5?7???
		int c = 0;
		int d = 0;
		b = a % 3;
		c = a % 5;
		d = a % 7;
		if (b == 0 && c == 0 && d == 0)
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
		else
		{
			if (b == 0 && c == 0)
			{
				System.out.print("3 5");
				System.out.print("\n");
			}
			else
			{
				if (c == 0 && d == 0)
				{
					System.out.print("5 7");
					System.out.print("\n");
				}
				else
				{
					if (b == 0 && d == 0)
					{
						System.out.print("3 7");
						System.out.print("\n");
					}
					else
					{
						if (b == 0)
						{
							System.out.print("3");
							System.out.print("\n");
						}
						else
						{
							if (c == 0)
							{
								System.out.print("5");
								System.out.print("\n");
							}
							else
							{
								if (d == 0)
								{
									System.out.print("7");
									System.out.print("\n");
								}
								else
								{
									System.out.print("n");
									System.out.print("\n");
								}
							}
						}
					}
				}
			}
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}


}

