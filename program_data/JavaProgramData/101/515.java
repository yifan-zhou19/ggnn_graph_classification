package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 0;a <= 2;a++)
		{
			for (b = 0;b <= 2;b++)
			{
				for (c = 0;c <= 2;c++)
				{
					if (((a > b) + (c == a)) == a && ((a < b) + (a < c)) == b && ((c < b) + (b < a)) == c)
					{
						if (b > c && c > a)
						{
								System.out.print("BCA");
						}
						else if (a > c && c > b)
						{
								System.out.print("ACB");
						}
						else if (b > a && a > c)
						{
								System.out.print("BAC");
						}
						else if (a > b && b > c)
						{
								System.out.print("ABC");
						}
						else if (c > a && a > b)
						{
								System.out.print("CAB");
						}
						else if (c > b && b > a)
						{
							System.out.print("CBA");
						}

					}
				}
			}
		}
	return 0;
	}

}
