package <missing>;

public class GlobalMembers
{
	//-------------------
	//     ???
	//    2010/11/23
	//     ???
	//-------------------


	public static int Reverse(int x)
	{
		int y = 0;
		if (x == 0)
		{
			return 0;
		}
		while (x != 0)
		{
			y = y * 10 + x % 10;
			x = x / 10;
		}
		return y;
	}

	public static int Main()
	{
		int n = 6;
		int i;
		int X;
		for (i = 0;i < n;i++)
		{
			X = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(Reverse(X));
			System.out.print("\n");
		}
		return 0;
	}
}

