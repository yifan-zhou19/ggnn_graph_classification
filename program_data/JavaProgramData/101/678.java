package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 1; a <= 3; a++)
		{
			for (b = 1; b <= 3; b++)
			{
				for (c = 1; c <= 3; c++)
				{
					if (a * b * c == 6 && a + b + c == 6)
					{
						if (((b > a) + (c == a) == (3 - a)) && ((a > b) + (a > c) == (3 - b)) && ((c > b) + (b > a) == (3 - c))) ///???????????3
						{
							if (a < b && b < c)
							{
								System.out.print("CBA");
								System.out.print("\n");
								return 0;
							}
						}
							if (a < c && c < b)
							{
									System.out.print("BCA");
									System.out.print("\n");
									return 0;
							}
							if (b < a && a < c)
							{
									System.out.print("CAB");
									System.out.print("\n");
									return 0;
							}
							if (b < c && c < a)
							{
									System.out.print("ACB");
									System.out.print("\n");
									return 0;
							}
							if (c < a && a < b)
							{
									System.out.print("BAC");
									System.out.print("\n");
									return 0;
							}
							if (c < b && c < a)
							{
									System.out.print("ACB");
									System.out.print("\n");
									return 0;
							}
					}
				}
			}
		}
	}



}
