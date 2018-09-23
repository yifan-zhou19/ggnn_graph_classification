package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x; //????
		int y;
		int p;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x == y)
		{
			System.out.print(x);
			System.out.print("\n");
		}
		else
		{ //???????
			if (x < y)
			{
				p = x;
				x = y;
				y = p;
			} //?x?????
			p = x; //?????x??
			for (;y >= 1;y = (y % 2 == 0)?y / 2:(y - 1) / 2)
			{ //?y????y=1
				x = p; //x???????????
				while (x >= 1)
				{ //?x>=1?
					x = (x % 2 == 0)?x / 2:(x - 1) / 2; //??x?????
					if (x == y)
					{ //????x=y
						System.out.print(x);
						System.out.print("\n");
						return 0; //??
					}
				}
			}
		}
		return 0;
	}
}

