package <missing>;

public class GlobalMembers
{
	/*
	 * bifanliang.cpp
	 * ??:???
	 * ????: 2012-10-26
	 * ??????
	 */
	public static int Main()
	{
		int A = 0; //????
		int B = 0;
		int C = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		for (A = 1;A <= 3;A++) //????????
		{
			for (B = 1;B <= 3;B++)
			{
				if (A == B)
				{
					continue;
				}
				else
				{
					for (C = 1;C <= 3;C++)
					{
						if ((C == B) || (C == A))
						{
							continue;
						}
						else
						{
							if (((B > A) + (C == A) == (3 - A)) && ((A > B) + (A > C) == (3 - B)) && ((C > B) + (B > A) == (3 - C)))
							{
								a = A;
								b = B;
								c = C; //??????????????????
							}
						}
					}
				}
			}
		}
		if ((a > b) && (b > c))
		{
			System.out.print("CBA");
		}
		if ((a > c) && (c > b))
		{
			System.out.print("BCA");
		}
		if ((b > a) && (a > c))
		{
			System.out.print("CAB");
		}
		if ((b > c) && (c > a))
		{
			System.out.print("ACB");
		}
		if ((b > a) && (a > c))
		{
			System.out.print("CAB");
		}
		if ((c > a) && (a > b))
		{
			System.out.print("BAC");
		}
		if ((c > b) && (b > a))
		{
			System.out.print("ABC");
		}
		return 0; //????
	}

}
