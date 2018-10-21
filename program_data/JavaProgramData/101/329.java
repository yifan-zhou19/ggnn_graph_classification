package <missing>;

public class GlobalMembers
{
	// ???.cpp: ??????
	//???
	//1000062701
	public static int Main()
	{
		int a;
		int b;
		int c;
		int x;
		int y;
		int z;
		for (a = 0; a < 3; a++)
		{
			for (b = 0; b < 3; b++)
			{
				for (c = 0; c < 3; c++)
				{
					x = (b > a) + (c == a);
					y = (a > b) + (a > c);
					z = (c > b) + (b > a);
					if (a + x == 2 && b + y == 2 && c + z == 2)
					{
						if (a > b)
						{
							if (b > c)
							{
								System.out.print("CBA");
								System.out.print("\n");
							}
							else
							{
								System.out.print("BCA");
								System.out.print("\n");
							}
						}
						if (c > a)
						{
							if (a > b)
							{
								System.out.print("BAC");
								System.out.print("\n");
							}
							else
							{
								System.out.print("ABC");
								System.out.print("\n");
							}
						}
						if (b > a)
						{
							if (c > a)
							{
								System.out.print("ACB");
								System.out.print("\n");
							}
							else
							{
								System.out.print("CAB");
								System.out.print("\n");
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
