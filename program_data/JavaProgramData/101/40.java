package <missing>;

public class GlobalMembers
{
	/**
	* @file		????.cpp
	* @author	??	1000012792
	* @date		2010.11.15
	*/
	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 0;a < 3;a++) //0,1,2????????
		{
			for (b = 0;b < 3;b++)
			{
				for (c = 0;c < 3;c++)
				{
					if ((a + (b > a) + (c == a) == 2) && (b + (a > b) + (a > c) == 2) && (c + (c > b) + (b > a) == 2))
					{
					if (a > b) //??????????????????ABC
					{
						if (b > c)
						{
							System.out.print("CBA");
						}
						else
						{
							if (a > c)
							{
								System.out.print("BCA");
							}
							else
							{
								System.out.print("BAC");
							}

						}
					}
					else
					{
						if (a > c)
						{
							System.out.print("CAB");
						}
						else
						{
							if (b > c)
							{
								System.out.print("ACB");
							}
							else
							{
								System.out.print("ABC");
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
