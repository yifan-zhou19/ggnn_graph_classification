package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			double a;
			double b;
			int x;
			int y;
				x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (i == 1)
				{
					b = (double)y / x;
				}
				else
				{
					if (i != 1)
					{
						a = (double)y / x;
						if ((a - b) > 0.05)
						{
							System.out.print("better");
							System.out.print("\n");
						}
						else
						{
							if ((b - a) > 0.05)
							{
								System.out.print("worse");
								System.out.print("\n");
							}
							else
							{
								System.out.print("same");
								System.out.print("\n");
							}
						}
					}
				}
		}
	return 0;
	}
}

