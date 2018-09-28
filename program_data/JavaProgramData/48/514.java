package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????????                       
	//*?????? 1100012789      
	//*???2011.11.25                       
	//****************************************

	public static int Multi(int x, int y, int day)
	{
		if (day == 0)
		{
			if (x == 5 && y == 5)
			{
				return n;
			}
			else
			{
				return 0;
			}
		}
		return (Multi(x, y, day - 1) * 2 + Multi(x - 1, y - 1, day - 1) + Multi(x - 1, y, day - 1) + Multi(x - 1, y + 1, day - 1) + Multi(x, y - 1, day - 1) + Multi(x, y + 1, day - 1) + Multi(x + 1, y - 1, day - 1) + Multi(x + 1, y, day - 1) + Multi(x + 1, y + 1, day - 1));


	}
	public static int n;
	public static int Main()
	{
		int day;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i < 10; i++) // ?????
		{
			System.out.print(Multi(i, 1, day));
			for (j = 2; j < 10; j++)
			{
				System.out.print(" ");
				System.out.print(Multi(i, j, day));
			}
			System.out.print("\n");
		}
		return 0;
	}

}

