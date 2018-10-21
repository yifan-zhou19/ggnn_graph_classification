package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????????           **
	//*?????? 1200012808      **
	//*???2012.10.10             **
	//********************************

	// ?????????????????????int f(int x) 
	public static int f(int x)
	{
		int j;
		for (j = 2; j <= Math.sqrt((double)x); j++)
		{
			if (x % j == 0)
			{
				return false;
			}
		}
		return true;
	}

	public static int Main()
	{
		int m;
		int x;
		int y;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (x = 3; x <= m / 2 ; x += 2) // ?????m??????
		{
			y = m - x;
			if ((f(x) == true) && (f(y) == true)) // ??x?m-x?????
			{
				System.out.print(x);
				System.out.print(" ");
				System.out.print(y);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

