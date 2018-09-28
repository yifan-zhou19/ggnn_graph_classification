package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String s = new String(new char[33]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			s = new Scanner(System.in).nextLine();
			int l = s.length() - 1;
			if (s.charAt(l) == 'g' && s.charAt(l - 1) == 'n' && s.charAt(l - 2) == 'i')
			{
				s = tangible.StringFunctions.changeCharacter(s, l - 2, '\0');
				System.out.println(s);
			}
			else
			{
				if ((s.charAt(l) == 'y' && s.charAt(l - 1) == 'l') || (s.charAt(l) == 'r' && s.charAt(l - 1) == 'e'))
				{
					s = tangible.StringFunctions.changeCharacter(s, l - 1, '\0');
					System.out.println(s);
				}
			}
		}
	}
}

