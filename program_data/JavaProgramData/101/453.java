package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		char Ra;
		char Rb;
		char Rc;
		for (a = 1; a <= 3; a++)
		{
			for (b = 1; b <= 3; b++)
			{
				for (c = 1; c <= 3; c++)
				{
					Ra = (b > a) + (c == a);
					Rb = (a > b) + (a > c);
					Rc = (c > b) + (b > a);
					if (Ra == 3 - a && Rb == 3 - b && Rc == 3 - c)
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
										if (c > a && a > b)
										{
											System.out.print("BAC");
										}
										else
										{
											if (c > b && b > a)
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
			}
		}
		return 0;
	}

}
