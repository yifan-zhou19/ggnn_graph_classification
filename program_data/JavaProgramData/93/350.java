package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = d % 3;
		b = d % 5;
		c = d % 7;
		if (a == 0 && b == 0 && c == 0)
		{
			System.out.print(3);
			System.out.print(" ");
			System.out.print(5);
			System.out.print(" ");
			System.out.print(7);
		}
			else
			{
			if (a == 0 && b == 0)
			{
				System.out.print(3);
				System.out.print(" ");
				System.out.print(5);
			}
			else
			{
				if (a == 0 && c == 0)
				{
					System.out.print(3);
					System.out.print(" ");
					System.out.print(7);
				}
				else
				{
					if (c == 0 && b == 0)
					{
						System.out.print(5);
						System.out.print(" ");
						System.out.print(7);
					}
					else
					{
						if (a == 0)
						{
							System.out.print(3);
						}
						else
						{
							if (b == 0)
							{
								System.out.print(5);
							}
							else
							{
								if (c == 0)
								{
									System.out.print(7);
								}
								else
								{
									System.out.print("n");
								}
							}
						}
					}
				}
			}
			}

	}
}

