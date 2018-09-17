package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ass;
		int bss;
		int css;
		for (int a = 1;a < 4;a++)
		{
			for (int b = 1;b < 4;b++)
			{
				for (int c = 1;c < 4;c++)
				{
					int as = (b > a) + (c == a);
					int bs = (a > b) + (a > c);
					int cs = (c > b) + (b > a);
					if (!(a <= b != 0 && as <= bs != 0 || a <= c != 0 && as <= cs != 0 || b <= c != 0 && bs <= cs != 0 || b <= a != 0 && bs <= as != 0 || c <= a != 0 && cs <= as != 0 || c <= b != 0 && cs <= bs))
					{
						ass = a,bss = b,css = c;
					}
				}
			}
		}
		if (ass >= bss != 0 && bss >= css)
		{
			System.out.print("CBA");
			System.out.print("\n");
		}
		if (ass >= css != 0 && css >= bss)
		{
			System.out.print("BCA");
			System.out.print("\n");
		}
		if (bss >= ass != 0 && ass >= css)
		{
			System.out.print("CAB");
			System.out.print("\n");
		}
		if (bss >= css != 0 && css >= ass)
		{
			System.out.print("ACB");
			System.out.print("\n");
		}
		if (css >= ass != 0 && ass >= bss)
		{
			System.out.print("BAC");
			System.out.print("\n");
		}
		if (css >= bss != 0 && bss >= ass)
		{
			System.out.print("ABC");
			System.out.print("\n");
		}
		return 0;
	}
}
