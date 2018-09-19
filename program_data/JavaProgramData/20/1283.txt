package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[15]);
		String sub = new String(new char[4]);
		String a = new String(new char[11]);
		char b;
		int n;
		int m;
		int t;
		while (scanf("%s%s",str,sub) != EOF)
		{
			m = 0;
			b = str.charAt(0);
			for (n = 1;str.charAt(n) != '\0';n++)
			{
				if (str.charAt(n) > b)
				{
				b = str.charAt(n);
				m = n;
				}
			}
			for (n = m + 1,t = 0;str.charAt(n) != '\0';n++,t++)
			{
				a = tangible.StringFunctions.changeCharacter(a, t, str.charAt(n));
			}
			a = tangible.StringFunctions.changeCharacter(a, t, '\0');
			str = tangible.StringFunctions.changeCharacter(str, m + 1, '\0');
			System.out.printf("%s%s%s\n",str,sub,a);
		}
		return 0;
	}

}

