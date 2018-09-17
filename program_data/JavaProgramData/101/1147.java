package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				if (b != a)
				{
					c = 6 - a - b;
					if ((b > a) + (c == a) == 3 - a)
					{
						if ((a > b) + (a > c) == 3 - b)
						{
							if ((c > b) + (b > a) == 3 - c)
							{
								if (a == 1)
								{
									System.out.print("A");
								}
								if (b == 1)
								{
									System.out.print("B");
								}
								if (c == 1)
								{
									System.out.print("C");
								}
								if (a == 2)
								{
									System.out.print("A");
								}
								if (b == 2)
								{
									System.out.print("B");
								}
								if (c == 2)
								{
									System.out.print("C");
								}
								if (a == 3)
								{
									System.out.print("A");
								}
								if (b == 3)
								{
									System.out.print("B");
								}
								if (c == 3)
								{
									System.out.print("C");
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
