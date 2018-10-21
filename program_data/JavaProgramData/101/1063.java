package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int Aa;
		int Bb;
		int Cc;
		for (a = 1;a < 4;a++)
		{
			for (b = 1;b < 4;b++)
			{
				for (c = 1;c < 4;c++)
				{
					Aa = (b > a) + (c == a);
											Bb = (a > b) + (a > c);
											Cc = (c > b) + (b > a);
											if (a + Aa == 3)
											{
																if (b + Bb == 3)
																{
																	if (c + Cc == 3)
																	{

						if (a > b && b > c)
						{
							System.out.print("CBA");
						}
						else
						{
					if (a > c && c > b)
					{
											System.out.print("BCA");
					}
					else
					{
					if (b > a && a > c)
					{
											System.out.print("CAB");
					}
					else
					{
					if (b > c && c > a)
					{
											System.out.print("ACB");
					}
					else
					{
					if (c > b && b > a)
					{
											System.out.print("ABC");
					}
					else
					{
					if (c > a && a > b)
					{
											System.out.print("BAC");
					}
					}
					}
					}
					}
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
