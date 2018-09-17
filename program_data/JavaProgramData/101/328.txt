package <missing>;

public class GlobalMembers
{
	//****************************************************************
	// ???wusy                                                    *
	// ???11,17                                                   *
	// ??????                                                  *
	//****************************************************************
	public static int Main()
	{
		int sa;
		int sb;
		int sc;
		for (int a = 1; a <= 3; a++)
		{
			for (int b = 1; b <= 3; b++)
			{
				for (int c = 1; c <= 3; c++)
				{
					sa = (b > a) + (c == a);
					sb = (a > b) + (a > c);
					sc = (c > b) + (b > a);

					if ((a + sa == 3) && (b + sb == 3) && (c + sc == 3))
					{
						if (a > b && b > c)
						{
							System.out.print("CBA");
						}
						if (a > c && c > b)
						{
							System.out.print("BCA");
						}
						if (b > c && c > a)
						{
							System.out.print("ACB");
						}
						if (b > a && a > c)
						{
							System.out.print("CAB");
						}
						if (c > b && b > a)
						{
							System.out.print("ABC");
						}
						if (c > a && a > b)
						{
							System.out.print("BAC");
						}
					}
				}
			}
		}
		return 0;
	}






}
