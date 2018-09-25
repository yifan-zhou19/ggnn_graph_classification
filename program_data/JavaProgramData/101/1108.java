package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : homework.cpp
	// Author      : ???
	// Time        : 2013.10.23
	// Description : ???
	//============================================================================

	public static int Main()
	{
		int a = 0; //?????
		int b = 0;
		int c = 0;
		for (a = 0;a <= 2;a++)
		{ //a??
			for (b = 0;b <= 2;b++)
			{ //b??
				for (c = 0;c <= 2;c++)
				{ //c??
					if (a == b || a == c || b == c) //?????????
					{
						continue;
					}
					int x = 0; //?????????
					int y = 0;
					int z = 0;
					if (b > a)
					{
						x++;
					}
					if (a > b)
					{
						y++;
					}
					if (a > c)
					{
						y++;
					}
					if (c > b)
					{
						z++;
					}
					if (b > a)
					{
						z++;
					}
					if (a > b && b > c && x < y && y < z) //?????????
					{
						System.out.print("CBA");
						System.out.print("\n");
					}
					if (a > c && c > b && x < z && z < y)
					{
						System.out.print("BCA");
						System.out.print("\n");
					}
					if (b > a && a > c && y < x && x < z)
					{
						System.out.print("CAB");
						System.out.print("\n");
					}
					if (b > c && c > a && y < z && z < x)
					{
						System.out.print("ACB");
						System.out.print("\n");
					}
					if (c > a && a > b && z < x && x < y)
					{
						System.out.print("BAC");
						System.out.print("\n");
					}
					if (c > b && b > a && z < y && y < x)
					{
						System.out.print("ABC");
						System.out.print("\n");
					}

				}
			}
		}
		return 0;
	} //?????

}
