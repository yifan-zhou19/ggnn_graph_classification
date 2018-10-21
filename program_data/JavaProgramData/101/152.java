package <missing>;

public class GlobalMembers
{
	//**************************************************************************
	//*???????                                                          *
	//*???????????                                                  *
	//*??????                                                            *
	//*???2010?11?17?                                                    *
	//**************************************************************************
	public static int Main()
	{
		int a; //???????a,b,c????????????
		int b;
		int c;
		int i;
		int flag = 0;
		int sa;
		int sb;
		int sc;
		for (a = 1; a <= 3; a++)
		{
			for (b = 1; b <= 3; b++)
			{
				for (c = 1; c <= 3; c++)
				{ //???????????????1?3???????
					sa = (b > a) + (c == a);
					sb = (a > b) + (a > c);
					sc = (c > b) + (b > a); //sa,sb.sc??????????????
					if (a > b && sa < sb && b> c && sb < sc)
					{
						flag = 1;
						System.out.print("ABC");
					}
					if (a > c && sa < sc && c> b && sc < sb)
					{
						flag = 1;
						System.out.print("ACB");
					}
					if (b > a && sb < sa && a> c && sa < sc)
					{
						flag = 1;
						System.out.print("BAC");
					}
					if (b >= c != 0 && sb <= sc != 0 && c >= a != 0 && sc <= sa)
					{
						flag = 1;
						System.out.print("BCA");
					}
					if (c > a && sc < sa && a> b && sa < sb)
					{
						flag = 1;
						System.out.print("CAB");
					}
					if (c > b && sc < sb && b> a && sb < sa)
					{
						flag = 1;
						System.out.print("CBA");
					} //???????????????????????????????
					if (flag == 1)
					{
						break;
					}

				}
				if (flag == 1)
				{
					break;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}
				return 0;
	}


}
