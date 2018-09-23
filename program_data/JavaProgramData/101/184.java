package <missing>;

public class GlobalMembers
{
	/*
	 * file    homework 8_4
	 * author  ??
	 * date    2010-11-18
	 * description
	           ???????
	*/



	public static int Main()
	{
		int a;
		int b;
		int c;
		int t;
		int aa;
		int bb;
		int cc;
		for (a = 0; a <= 2; a++)
		{
			for (b = 0; b <= 2; b++)
			{
				for (c = 0; c <= 2; c++)
				{
					t = 0;
					aa = (b > a) + (c == a);
					bb = (a > b) + (a > c);
					cc = (c > b) + (b > a);
					t = (a + aa == 2) + (b + bb == 2) + (c + cc == 2);
					if (t == 3)
					{
						break;
					}
				}
				if (t == 3)
				{
					break;
				}
			}
			if (t == 3)
			{
				break;
			}
		}
		if (a > b)
		{
			if (b > c)
			{
				System.out.print("CBA");
				System.out.print("\n");
			}
			else
			{
				if (a > c)
				{
					System.out.print("BCA");
					System.out.print("\n");
				}
				else
				{
					System.out.print("BAC");
					System.out.print("\n");
				}
			}
		}
		else
		{
			if (a > c)
			{
				System.out.print("CAB");
				System.out.print("\n");
			}
			else
			{
				if (b > c)
				{
					System.out.print("ACB");
					System.out.print("\n");
				}
				else
				{
					System.out.print("ABC");
					System.out.print("\n");
				}
			}
		}

		return 0;
	}



}
