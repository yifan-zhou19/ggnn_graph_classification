package <missing>;

public class GlobalMembers
{
	//****************************************
	//*??????                         **
	//*????? 1100012780     	        **
	//*???2011.10.16                     **
	//****************************************
	public static int Main()
	{
		int A; //A,B,C?????ABC?????????????abc?????????
		int B;
		int C;
		int a;
		int b;
		int c;
		for (a = 0;a <= 2;a++)
		{
			if (a == 0) //A???a?????
			{
				continue;
			}
			for (b = 0;b <= 2;b++)
			{
				if (b == a) //b????a?????
				{
					continue;
				}
				for (c = 0;c <= 2;c++)
				{
					A = (b > a);
					B = (a > b) + (a > c);
					C = (c > b) + (b > a);
					if ((b == a) || (b == c) || (a == c))
					{
						continue;
					}
					if ((a + A == 2) && (b + B == 2) && (c + C == 2))
					{
						if (a == 2)
						{
							if (b == 1)
							{
								System.out.print("CBA");
							}
							if (b == 0)
							{
								System.out.print("BCA");
							}
						}
						if (a == 1)
						{
							if (b == 0)
							{
								System.out.print("BAC");
							}
							if (b == 2)
							{
								System.out.print("CAB");
							}
						}
					}
				}
			}
		}
		return 0;
	}


}
