package <missing>;

public class GlobalMembers
{
	public static int up(int x) //????????????????
	{
		if (x % 2 == 1)
		{
			return (x - 1) / 2;
		}
		else
		{
			return x / 2;
		}
	}
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (x != y) //?x???y????????
		{
			if (Math.abs(x - y) == 1) //?????x?y??????????
			{
				y = up(y);
				x = up(x);
			}
			else
			{
				if (y > x)
				{
					y = up(y); //????????????
				}
				else
				{
					x = up(x);
				}
			}
		}
		System.out.print(x);
		System.out.print("\n");
		return 0;
	}

}

