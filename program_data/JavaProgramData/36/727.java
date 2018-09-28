package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[10]);
		String s2 = new String(new char[10]);
		char c;
		int n1;
		int n2;
		int i;
		int j;
		int k;
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
		n1 = s1.length();
		n2 = s2.length();
		if (n1 != n2)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i <= n1 - 1;i++)
			{
				for (j = 0;j < n1 - i;j++)
				{
					if (s1.charAt(j) <= s1.charAt(j + 1))
					{
						c = s1.charAt(j);
						s1 = tangible.StringFunctions.changeCharacter(s1, j, s1.charAt(j + 1));
						s1 = tangible.StringFunctions.changeCharacter(s1, j + 1, c);
					}
				}
			}
			for (i = 0;i <= n2 - 1;i++)
			{
				for (j = 0;j < n2 - i;j++)
				{
					if (s2.charAt(j) <= s2.charAt(j + 1))
					{
						c = s2.charAt(j);
						s2 = tangible.StringFunctions.changeCharacter(s2, j, s2.charAt(j + 1));
						s2 = tangible.StringFunctions.changeCharacter(s2, j + 1, c);
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

