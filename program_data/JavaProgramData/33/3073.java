package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int j;
		int n;
		String s = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			m = s.length();
			for (i = 0;i < m;i++)
			{
				if (s.charAt(i) == 65)
				{
					s = tangible.StringFunctions.changeCharacter(s, i, 84);
					System.out.printf("%c",s.charAt(i));
					continue;
				}
				if (s.charAt(i) == 84)
				{
					s = tangible.StringFunctions.changeCharacter(s, i, 65);
					System.out.printf("%c",s.charAt(i));
					continue;
				}
				if (s.charAt(i) == 67)
				{
					s = tangible.StringFunctions.changeCharacter(s, i, 71);
					System.out.printf("%c",s.charAt(i));
					continue;
				}
				if (s.charAt(i) == 71)
				{
					s = tangible.StringFunctions.changeCharacter(s, i, 67);
					System.out.printf("%c",s.charAt(i));
					continue;
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

