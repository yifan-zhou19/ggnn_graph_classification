package <missing>;

public class GlobalMembers
{
	//  ???
	//  ??? 1100012820
	//  20111012
	//*******************
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int cc1;
		int cc2;
		int cc3;
		for (a = 1; a <= 3; a++)
		{
			for (b = 1; b <= 3; b++)
			{
				for (c = 1; c <= 3; c++)
				{
					cc1 = (b > a) + (c == a);
					cc2 = (a > b) + (a > c);
					cc3 = (c > b) + (b > a);
					if (((a + cc1) == 3) && ((b + cc2) == 3) && ((c + cc3) == 3))
					{
						if (a == 3)
						{
							if (b == 2)
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
						if (b == 3)
						{
							if (a == 2)
							{
								System.out.print("CAB");
								System.out.print("\n");
							}
							else
							{
								System.out.print("ACB");
								System.out.print("\n");
							}
						}
						if (c == 3)
						{
							if (b == 2)
							{
								System.out.print("ABC");
								System.out.print("\n");
							}
							else
							{
								System.out.print("BAC");
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
