package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		char t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		l = s1.length();
		for (j = 0;j < l - 1;j++)
		{
			for (i = 0;i < l - 1 - j;i++)
			{
				if (s1.charAt(i) > s1.charAt(i + 1))
				{
					t = s1.charAt(i);
					s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i + 1));
					s1 = tangible.StringFunctions.changeCharacter(s1, i + 1, t);
				}
			}
		}
		for (j = 0;j < l - 1;j++)
		{
			for (i = 0;i < l - 1 - j;i++)
			{
				if (s2.charAt(i) > s2.charAt(i + 1))
				{
					t = s2.charAt(i);
					s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i + 1));
					s2 = tangible.StringFunctions.changeCharacter(s2, i + 1, t);
				}
			}
		}
		if (strcmp(s1,s2) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}






}

