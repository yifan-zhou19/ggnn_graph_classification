package <missing>;

public class GlobalMembers
{
	//****************************************
	//*??????                         **
	//*?????? 1100012802              **
	//*???2011.10.13                     **
	//****************************************
	public static int Main()
	{
		int a; //a?b?c????cc1?cc2?cc3???????????
		int b;
		int c;
		int cc1;
		int cc2;
		int cc3;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				if (b == a)
				{
					continue;
				}
				c = 6 - a - b;
				cc1 = a + (b > a) + (c == a);
				cc2 = b + (a > b) + (a > c);
				cc3 = c + (c > b) + (b > a);
				if (cc1 == 3 && cc2 == 3 && cc3 == 3)
				{
					if (a > b && b > c)
					{
						System.out.print("CBA");
					}
					if (a > c && c > b)
					{
						System.out.print("BCA");
					}
					if (b > a && a > c)
					{
						System.out.print("CAB");
					}
					if (b > c && c > a)
					{
						System.out.print("ACB");
					}
					if (c > a && a > b)
					{
						System.out.print("BAC");
					}
					if (c > b && b > a)
					{
						System.out.print("ABC");
					}
				}
			}
		}
		return 0;
	}

}
