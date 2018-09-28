package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[105]);
		int i = 0;
		int l = 0;
		int cir;
		do
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, tempVar);
			}
			i++;
			l++;
		}while (s.charAt(i - 1) != 10);
		s = tangible.StringFunctions.changeCharacter(s, l, '\0');
		l--;

		cir = s.charAt(l - 1) + s.charAt(0);
		for (i = 0;i < l - 1;i++)
		{
			s.charAt(i) += s.charAt(i + 1);
		}
		s = tangible.StringFunctions.changeCharacter(s, l - 1, cir);
		System.out.printf("%s",s);
	}
}

