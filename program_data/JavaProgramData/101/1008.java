package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int s1;
		int s2;
		int s3;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					s1 = (b > a) + (c == a) + 1;
					s2 = (a > b) + (a > c) + 1;
					s3 = (c > b) + (b > a) + 1;
					if (a + b + c == 6 && a * b * c == 6)
					{
						if (s1 + s2 + s3 == 6 && s1 * s2 * s3 == 6)
						{
							if (s1 + a == 4 && s2 + b == 4 && s3 + c == 4)
							{
							if (s1 == 3)
							{
								System.out.print("A");
							}
							if (s2 == 3)
							{
								System.out.print("B");
							}
							if (s3 == 3)
							{
								System.out.print("C");
							}
							if (s1 == 2)
							{
								System.out.print("A");
							}
							if (s2 == 2)
							{
								System.out.print("B");
							}
							if (s3 == 2)
							{
								System.out.print("C");
							}
							if (s1 == 1)
							{
								System.out.print("A");
							}
							if (s2 == 1)
							{
								System.out.print("B");
							}
							if (s3 == 1)
							{
								System.out.print("C");
							}
							//break;
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
