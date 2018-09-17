package <missing>;

public class GlobalMembers
{
	/*
	 * ???????.cpp
	 * ?????
	 * ????: 2012-10-23
	 * ??????
	 */
	public static int Main()
	{ //?????
		int a; //???????a,b,c,i
		int b;
		int c = 0;
		int i = 0;
		for (a = 0;a <= 2;a++)
		{
			for (b = 0;b <= 2;b++)
			{
				if (b == a)
				{
					continue;
				}
				for (c = 0;c <= 2;c++)
				{
					if (c == a || c == b)
					{
						continue; //????
					}
					if (a + (b > a) + (c == a) == 2 && b + (a > b) + (a > c) == 2 && c + (c > b) + (b > a) == 2) //??
					{
						for (i = 0;i <= 2;i++) //???????
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
						} //i?????
					}
				}
			}
		} //??????
		return 0;
	} //?????
}
