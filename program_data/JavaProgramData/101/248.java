package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //?a,b,c????A,B,C???
		int b;
		int c;
		for (a = 1;a <= 3; a++)
		{
			for (b = 1; b <= 3; b++)
			{
				for (c = 1; c <= 3; c++)
				{
					if (a + (b > a) + (c == a) == 3)
					{
						if (b + (a > b) + (a > c) == 3)
						{
							if (c + (c > b) + (b > a) == 3)
							{
								if ((a > b) && (a > c))
								{
									if (b > c)
									{
										System.out.print("CBA");
									}
									if (c > b)
									{
										System.out.print("BCA");
									}
								}
								if ((b > a) && (b > c))
								{
									if (a > c)
									{
										System.out.print("CAB");
									}
									if (a < c)
									{
										System.out.print("ACB");
									}
								}
								if ((c > a) && (c > b))
								{
									if (a > b)
									{
										System.out.print("BAC");
									}
									if (a < b)
									{
										System.out.print("ABC");
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
