package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s1 = "";
		final String s2 = "";
		char c;
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
		int i;
		int j;
		int l1 = s1.length();
		int l2 = s2.length();
		if (l1 != l2)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 1;i <= l1 - 1;i++)
			{
				for (j = 0;j <= l1 - i - 1;j++)
				{
					if (s1.charAt(j) > s1.charAt(j + 1))
					{
						c = s1.charAt(j + 1);
						s1 = tangible.StringFunctions.changeCharacter(s1, j + 1, s1.charAt(j));
						s1 = tangible.StringFunctions.changeCharacter(s1, j, c);
					}
				}
			}
			for (i = 1;i <= l1 - 1;i++)
			{
				for (j = 0;j <= l1 - i - 1;j++)
				{
					if (s2.charAt(j) > s2.charAt(j + 1))
					{
						c = s2.charAt(j + 1);
						s2 = tangible.StringFunctions.changeCharacter(s2, j + 1, s2.charAt(j));
						s2 = tangible.StringFunctions.changeCharacter(s2, j, c);
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
		}
	}
}

