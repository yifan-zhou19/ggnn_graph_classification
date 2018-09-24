package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		int i;
		for (a = 3;a >= 1;a--)
		{
			for (b = 3;b >= 1;b--)
			{
				if (a != b)
				{
					for (c = 3;c >= 1;c--)
					{
						if (a != c && b != c)
						{
							A = (b > a) + (c == a);
							B = (a > b) + (a > c);
							C = (c > b) + (b > a);
							if (a + A == 3 && b + B == 3 && c + C == 3)
							{
								for (i = 1;i <= 3;i++)
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
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
