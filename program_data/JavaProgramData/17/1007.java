package <missing>;

public class GlobalMembers
{
	public static void match(String s)
	{
		String b = new String(new char[101]);
		System.out.println(s);
		int l;
		int x = 0;
		int i;
		int[] left = new int[101];
		l = s.length();
		for (i = 0;i < l;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, ' ');
		}
		b = tangible.StringFunctions.changeCharacter(b, l, '\0');
		for (i = 0;i < l;i++)
		{
			if (s[i].equals('('))
			{
				left[x++] = i;
			}
			else if (s[i].equals(')'))
			{
					if (x == 0)
					{
						b = tangible.StringFunctions.changeCharacter(b, i, '?');
					}
					else
					{
						x--;
					}
			}
		}
		for (i = 0;i < x;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, left[i], '$');
		}
		System.out.println(b);
	}
	public static int Main()
	{
		String a = new String(new char[101]);
		while ((gets(a)))
		{
			match(a);
		}
	}

}

