package <missing>;

public class GlobalMembers
{
	//***********************
	//??????
	//?????
	//???2011.10.16
	//***********************
	public static int Main() //???
	{ //?????
		int a; //????A?B?C???
		int b;
		int c;
		a = 3; //???????????
		b = 2;
		c = 1;
		if ((b <= a != 0 && c != a) + (a > b || a > c) + (c > b && b > a) == 3)
		{
			System.out.print("CBA");
		}
		else
		{
			a = 3;
			b = 1;
			c = 2;
			if ((b <= a != 0 && c != a) + (a > b && a > c) + (c > b || b > a) == 3)
			{
				System.out.print("BCA");
			}
			else
			{
				a = 2;
				b = 1;
				  c = 3;
				if ((b > a || c == a) + (a > b && a > c) + (c <= b != 0 && b <= a) == 3)
				{
					System.out.print("BAC");
				}
				else
				{
					a = 2;
					 b = 3;
					c = 1;
					if ((b > a || c == a) + (a <= b != 0 && a <= c) + (c > b && b > a) == 3)
					{
						System.out.print("CAB");
					}
					else
					{
						a = 1;
						b = 2;
						c = 3;
						if ((b > a && c == a) + (a <= b != 0 || a <= c) + (c <= b != 0 && b <= a) == 3)
						{
							System.out.print("ABC");
						}
						else
						{
							a = 1;
							b = 3;
							c = 2;
							if ((b > a && c == a) + (a <= b != 0 && a <= c) + (c <= b != 0 || b <= a) == 3)
							{
								 System.out.print("ACB");
							}
						}
					}
				}
			}
		}
		return 0;
	} //?????
}
