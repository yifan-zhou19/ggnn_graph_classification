package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[20]);
		String a = new String(new char[5]);
		String b = new String(new char[10]);
		int i;
		int len;
		int max;
		int num;
		while (gets(ch) != null)
		{
			num = 0;
			len = ch.length();
			for (i = len - 3; i < len; i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, num++, ch.charAt(i));
			}
			a = tangible.StringFunctions.changeCharacter(a, num, '\0');
			max = 0;
			for (i = 0; i < len - 4; i++)
			{
				if (ch.charAt(i) > ch.charAt(max))
				{
					max = i;
				}
			}
			num = 0;
			for (i = max + 1; i < len - 3; i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, num++, ch.charAt(i));
			}
			b = tangible.StringFunctions.changeCharacter(b, num - 1, '\0');
			ch = tangible.StringFunctions.changeCharacter(ch, max + 1, '\0');
			ch += a;
			ch += b;
			System.out.println(ch);
		}
		return 0;
	}

}

