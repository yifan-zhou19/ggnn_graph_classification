package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int t;
		String s = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (t = 0;t < n;t++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			int l;
			l = s.length();
			if ((s.charAt(l - 1) == 'r' && s.charAt(l - 2) == 'e') || (s.charAt(l - 1) == 'y' && s.charAt(l - 2) == 'l'))
			{
				s = tangible.StringFunctions.changeCharacter(s, l - 2, '\0');
			}
			if (s.charAt(l - 1) == 'g' && s.charAt(l - 2) == 'n' && s.charAt(l - 3) == 'i')
			{
				s = tangible.StringFunctions.changeCharacter(s, l - 3, '\0');
			}
			System.out.printf("%s\n",s);
		}
	}
}

