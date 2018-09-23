package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //??????abc??????????ap?bp?cp
		int b;
		int c;
		int ap;
		int bp;
		int cp;
		for (a = 1;a <= 3;a++)
		{
				for (b = 1;b <= 3;b++)
				{
						for (c = 1;c <= 3;c++)
						{
								ap = (b > a) + (c == a);
								bp = (a > b) + (a > c);
								cp = (c > b) + (b > a); //??ABC??????
								if (a + ap == b + bp && b + bp == c + cp)
								{
									break; //?????????????????
								}
						}
						if (c <= 3)
						{
							break; //????
						}
				}
				if (b <= 3)
				{
					break;
				}
		}
		if (a < b && b <= c)
		{
		System.out.print("ABC");
		}
		else if (a < c && c <= b)
		{
		System.out.print("ACB");
		}
		else if (b < a && a <= c)
		{
		System.out.print("BAC");
		}
		else if (b < c && c <= a)
		{
		System.out.print("BCA");
		}
		else if (c < a && a <= b)
		{
		System.out.print("CAB");
		}
		else if (c < b && b <= a)
		{
		System.out.print("CBA");
		}
		return 0;
	}

}
