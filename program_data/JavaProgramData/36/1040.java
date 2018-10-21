package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		char t;
		int l1;
		int l2;
		int i;
		int j;
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
		l1 = s1.length();
		l2 = s2.length();
		if (l1 != l2)
		{
			System.out.print("NO\n");
		}
		else
		{
			for (i = 0;i <= l1 - 2;i++)
			{
				for (j = i + 1;j <= l1 - 1;j++)
				{
					if (s1.charAt(i) < s1.charAt(j))
					{
						t = s1.charAt(i);
						s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(j));
						s1 = tangible.StringFunctions.changeCharacter(s1, j, t);
					}
					if (s2.charAt(i) < s2.charAt(j))
					{
						t = s2.charAt(i);
						s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(j));
						s2 = tangible.StringFunctions.changeCharacter(s2, j, t);
					}
				}
			}
			if (strcmp(s1,s2) == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}


}

