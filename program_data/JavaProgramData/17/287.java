package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		while (scanf("%s",a) != EOF)
		{
			final String al = "";
			int i;
			for (i = 0;a.charAt(i);i++)
			{
				if (a.charAt(i) == '(')
				{
					al = tangible.StringFunctions.changeCharacter(al, i, '$');
				}
				else if (a.charAt(i) == ')')
				{
					al = tangible.StringFunctions.changeCharacter(al, i, '?');
				}
				else
				{
					al = tangible.StringFunctions.changeCharacter(al, i, ' ');
				}
			}
			void func(char s[]);

			func(al);
			System.out.println(a);
			System.out.println(al);
			a = "'\0'";
		}
		return 0;
	}
	public static void func(String s)
	{
		int i;
		int t1 = 0;
		int t2 = 0;
		int n = s.length();
		for (i = 0;i < s.length();i++)
		{
			while (!(s[i].equals('$') || s[i].equals('?')) && !s[i].equals('\0'))
			{
				i++;
			}
			t1 = i;

			i = i + 1;
			while (!(s[i].equals('$') || s[i].equals('?')) && !s[i].equals('\0'))
			{

					 i++;
			}

			if (s[i].equals('\0'))
			{
				break;
			}
			t2 = i;
			if (s[t1].equals('$') && s[t2].equals('?'))
			{
					s[t1] = ' ';
					s[t2] = ' ';
					i = -1;
					continue;
			}
			i = t1;
		}
	}

}

