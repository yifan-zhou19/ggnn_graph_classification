package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[100]);
	public static int l;
	public static int n;
	public static int Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(gets(s)).length();
				if (l >= 3 && s.charAt(l - 3) == 'i' && s.charAt(l - 2) == 'n' && s.charAt(l - 1) == 'g')
				{
					s = tangible.StringFunctions.changeCharacter(s, l - 3, '\0');
				}
				else if (l >= 2 && s.charAt(l - 2) == 'e' && s.charAt(l - 1) == 'r')
				{
					s = tangible.StringFunctions.changeCharacter(s, l - 2, '\0');
				}
				else if (l >= 2 && s.charAt(l - 2) == 'l' && s.charAt(l - 1) == 'y')
				{
					s = s.substring(0, l - 2);
				}
				System.out.println(s);
		}
			return 0;
	}


}

