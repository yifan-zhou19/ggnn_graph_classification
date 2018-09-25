package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[1001]);
		char s;
		int i;
		int ln;
		int m;
		int j;
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		ln = ch.length();
		for (i = 0;i < ln;i++)
		{
			if (ch.charAt(i) >= 96)
			{
				ch = tangible.StringFunctions.changeCharacter(ch, i, ch.charAt(i) - 32);
			}
		}
		m = 0;
		j = 1;
		for (i = 0;i < ln;i++)
		{
			s = ch.charAt(i);

			if (ch.charAt(i + 1) == s)
			{
				j++;
			}
			else
			{
				System.out.print("(");
				System.out.print(s);
				System.out.print(",");
				System.out.print(j);
				System.out.print(")");
			   m = i;
			   j = 1;
			}
		}
		return 0;
	}



}

