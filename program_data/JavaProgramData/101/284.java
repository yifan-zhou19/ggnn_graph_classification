package <missing>;

public class GlobalMembers
{
	/**
	 * @file ???
	 * @author ???
	 * @date 11-17
	 * @description ??????
	 */
	public static int Main()
	{
		int a;
		int b;
		int c;
		int sa;
		int sb;
		int sc;
		int i;
		for (a = 1; a <= 3; a++)
		{
			for (b = 1; b <= 3; b++)
			{
				for (c = 1; c <= 3; c++)
				{
					sa = 0;
					sb = 0;
					sc = 0;
					if (b > a)
					{
						sa++;
						sc++;
					}
					if (c == a)
					{
						sa++;
					}
					if (a > b)
					{
						sb++;
					}
					if (a > c)
					{
						sb++;
					}
					if (c > b)
					{
						sc++;
					}
					if (((a + sa) == 3) && ((b + sb) == 3) && ((c + sc) == 3))
					{
						for (i = 1; i <= 3; i++)
						{
							if (a == i)
							{
								System.out.print('A');
							}
							if (b == i)
							{
								System.out.print('B');
							}
							if (c == i)
							{
								System.out.print('C');
							}
						}
					}
				}
			}
		}
		return 0;
	}

}
