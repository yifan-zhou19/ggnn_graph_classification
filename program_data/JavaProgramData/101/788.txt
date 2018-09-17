package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //a,b,c???,a1,b1,c1?????p???,?????1
		int b;
		int c;
		int a1;
		int b1;
		int c1;
		int p = 0;
		for (a = 1;a < 4;a++)
		{
			for (b = 1;b < 4;b++)
			{
				for (c = 1;c < 4;c++)
				{
					a1 = (b > a) + (c == a);
					b1 = (a > b) + (a > c);
					c1 = (c > b) + (b > a); //??a,b,c????
					if ((a1 - b1) * (a - b) < 0 && (a1 - c1) * (a - c) < 0 && (b1 - c1) * (b - c) < 0)
					{
					   p = 1;
					   break;
					} //????p?1?????
				}
				if (p == 1)
				{
					break;
				}
			} //????p?1?????
			if (p == 1)
			{
				break;
			}
		} //????p?1?????
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
		return 0;
	}
}
