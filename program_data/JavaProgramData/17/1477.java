package <missing>;

public class GlobalMembers
{
	public static String s2 = new String(new char[101]);

	public static int ma(String s, int p, int le)
	{
		int ri;
		if (s[p].equals(0))
		{
			s2 = s2.substring(0, p);
			return 0;
		}
		else
		{
			if (s[p].equals('('))
			{
				ri = ma(s, p + 1, le+1);
				if (ri != 0)
				{
					s2 = tangible.StringFunctions.changeCharacter(s2, p, ' ');
					return ri - 1;
				}
				else
				{
					s2 = tangible.StringFunctions.changeCharacter(s2, p, '$');
					return 0;
				}
			}
			else if (s[p].equals(')'))
			{
				if (le != 0)
				{
					s2 = tangible.StringFunctions.changeCharacter(s2, p, ' ');
					return ma(s, p + 1, le-1) + 1;
				}
				else
				{
					s2 = tangible.StringFunctions.changeCharacter(s2, p, '?');
					return ma(s, p + 1, 0) + 1;
				}
			}
			else
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, p, ' ');
				return ma(s, p + 1, le);
			}
		}
	}

	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s1 = new String(new char[101]);
		int t;
		while (n != 0)
		{
			n = n - 1;
		s1 = new Scanner(System.in).nextLine();
		System.out.println(s1);
		t = ma(s1, 0, 0);
		System.out.printf("%s",s2);
		if (n != 0)
		{
			System.out.print("\n");
		}
		}
		return 0;
	}

}

