package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		for (a = 1; a <= 3; a++)
		{
			for (b = 1; b <= 3; b++)
			{
				if (a != b)
				{
					for (c = 1; c <= 3; c++)
					{
						if ((a != c) && (b != c))
						{
							if ((((b > a) + (a == c)) == 3 - a) && (((a > b) + (a > c)) == 3 - b) && (((c > b) + (b > a)) == 3 - c))
							{
								for (i = 1; i <= 3;i++)
								{
									if (a == i)
									{
										System.out.print("A");
									}
									if (b == i)
									{
										System.out.print("B");
									}
									if (c == i)
									{
										System.out.print("C");
									}
								}
								System.out.print("\n");
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
