package <missing>;

public class GlobalMembers
{
	public static void Replace(String s, int x)
	{
		for (int i = x + 1;i < s.length();i++)
		{
		if (s[i].equals(')'))
		{
			s[x] = s[i] = ' ';
			return;
		}
		if (s[i].equals('('))
		{
			Replace(s, i);
		}
		}
		s[x] = '$';
	}
	public static void Find(String s)
	{
		for (int i = 0;i < s.length();i++)
		{
	if (s[i].equals('$') || s[i].equals('?'))
	{
		continue;
	}
			if (s[i].equals('('))
			{
				Replace(s, i);
			}
			else if (s[i].equals(')'))
			{
				s[i] = '?';
			}
			else
			{
				s[i] = ' ';
			}
		}
		return;
	}

	public static int Main()
	{
		String live = new String(new char[101]); //string live;
		while ((live = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(live);
			System.out.print("\n");
			Find(live);
			System.out.print(live);
			System.out.print("\n");
		}
		return 0;
	}

}

