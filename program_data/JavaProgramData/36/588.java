package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		if (s1.length() != s2.length())
		{
			System.out.print("NO\n");
			return;
		}

		for (i = 0;i < (int)s1.length();i++)
		{
			for (j = 0;j < (int)s2.length();j++)
			{
				if (s1.charAt(i) == s2.charAt(j))
				{
					s2 = tangible.StringFunctions.changeCharacter(s2, j, -1);
					break;
				}
			}

			if (j >= (int)s2.length())
			{
				System.out.print("NO");
				return;
			}
		}
		System.out.print("YES\n");
	}

}

