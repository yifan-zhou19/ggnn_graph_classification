package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a_judge; //A,B,C?????????????
		int b_judge;
		int c_judge;
		int a; //A,B,C??????????
		int b;
		int c;
		char[] pname = {'A', 'B', 'C'}; //ABC???????????


		for (a = 0; a < 3; a++) //0?1?2????
		{
			for (b = 0; b < 3; b++)
			{
				for (c = 0; c < 3; c++)
				{
					a_judge = (b > a) + (c == a);
					b_judge = (a > b) + (a > c);
					c_judge = (c > b) + (b > a);

					if (((2 - a) == a_judge) && ((2 - b) == b_judge) && ((2 - c) == c_judge)) //A,B,C????????????
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
								if (a > c)
								{
									System.out.print("BCA");
									System.out.print("\n");
								}
								else
								{
									System.out.print("BAC");
									System.out.print("\n");
								}
							}
						}
						else
						{
							if (a > c)
							{
								System.out.print("CAB");
								System.out.print("\n");
							}
							else
							{
								if (b > c)
								{
									System.out.print("ACB");
									System.out.print("\n");
								}
								else
								{
									System.out.print("ABC");
									System.out.print("\n");
								}
							}
						}
					}
				}
			}
		}

				return 0;
	}

}
