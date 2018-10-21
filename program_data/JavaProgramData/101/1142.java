package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int k = 0;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for (a = 1;a < 4;a++)
		{
			for (b = 1;b < 4;b++)
			{
				if (b != a)
				{
					for (c = 1;c < 4;c++)
					{
						if (c != a && c != b)
						{
							c1 = (b > a) + (a == c);
							c2 = (a > b) + (a > c);
							c3 = (c > b) + (b > a);
							if (a + c1 == 3 && b + c2 == 3 && c + c3 == 3)
							{
								for (k = 1;k < 4;k++)
								{
									if (a == k)
									{
										System.out.print("A");
									}
									if (b == k)
									{
										System.out.print("B");
									}
									if (c == k)
									{
										System.out.print("C");
									}
								}
								System.out.print("\n");
								break;
							}
						}
					}
				}
			}
		}
		return 0;
	}

}
