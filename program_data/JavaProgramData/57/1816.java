package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[100]);
		int i;
		int len;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			len = s.length();
			if (s.charAt(len - 1) == 'r' && s.charAt(len - 2) == 'e')
			{
				s = tangible.StringFunctions.changeCharacter(s, len - 1, s.charAt(len));
				s = tangible.StringFunctions.changeCharacter(s, len - 2, s.charAt(len));
			}
			else if (s.charAt(len - 1) == 'y' && s.charAt(len - 2) == 'l')
			{
				s = tangible.StringFunctions.changeCharacter(s, len - 1, s.charAt(len));
				s = tangible.StringFunctions.changeCharacter(s, len - 2, s.charAt(len));
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, len - 1, s.charAt(len));
				s = tangible.StringFunctions.changeCharacter(s, len - 2, s.charAt(len));
				s = tangible.StringFunctions.changeCharacter(s, len - 3, s.charAt(len));
			}
			System.out.printf("%s\n",s);
		}
		return 0;
	}

}

