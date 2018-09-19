package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[14]);
		String sub = new String(new char[4]);
		char m;
		int d;
		int i;
		int l;
		while (scanf("%s %s",str,sub) != EOF)
		{
			l = str.length();
			m = 0;
			for (i = 0;i < l;i++)
			{
				if (str.charAt(i) - m > 0)
				{
					d = i;
					m = str.charAt(i);
				}
			}
			for (i = l - 1;i > d;i--)
			{
				str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
			}
			for (i = 0;i < 3;i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i + d + 1, sub.charAt(i));
			}
			str = tangible.StringFunctions.changeCharacter(str, l + 3, '\0');
			System.out.printf("%s\n",str);
		}
	}
}

