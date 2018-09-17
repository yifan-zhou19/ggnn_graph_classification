package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int as;
		int bs;
		int cs;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					as = (b > a) + (c == a);
					bs = (a > b) + (a > c);
					cs = (c > b) + (b > a);
					if (!((a <= b) && (as <= bs) || (a <= c) && (as <= cs) || (b <= a) && (bs <= as) || (b <= c) && (bs <= cs) || (c <= a) && (cs <= as) || (c <= b) && (cs <= bs)))
					{
						String shuzu = new String(new char[4]);
					shuzu = tangible.StringFunctions.changeCharacter(shuzu, a, 'A');
					shuzu = tangible.StringFunctions.changeCharacter(shuzu, b, 'B');
					shuzu = tangible.StringFunctions.changeCharacter(shuzu, c, 'C');
					for (int i = 1;i <= 3;i++)
					{
						System.out.print(shuzu.charAt(i));
					}
					}
				}
			}
		}
				return 0;
	}

}

