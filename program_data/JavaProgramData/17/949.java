package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[999]);
	public static int find(int i,int l)
	{
		int t;
		if (s.charAt(i) == '\0')
		{
			return -1;
		}
		if (s.charAt(i) == '(')
		{
			t = find(i + 1, l + 1);
			if (t == -1)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '$');
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, i, ' ');
			}
			if (t == -1)
			{
				return -1;
			}
			else
			{
				return find(t + 1, l);
			}
		}
		if (s.charAt(i) == ')')
		{
			if (l == 0)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '?');
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, i, ' ');
			}
			if (l == 0)
			{
				return find(i + 1, 0);
			}
			else
			{
				return i;
			}
		}
		s = tangible.StringFunctions.changeCharacter(s, i, ' ');
		return find(i + 1, l);
	}
	public static int Main()
	{
		for ((s; = ConsoleInput.readToWhiteSpace(true)).length() > 0)
		{
			System.out.print(s);
			System.out.print("\n");
			find(0, 0);
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}


}

