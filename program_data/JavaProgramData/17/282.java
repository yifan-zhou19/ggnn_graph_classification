package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int flag = 0;
		final String s = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		while ((s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') || s.charAt(0) == '(' || s.charAt(0) == ')')
		{

				System.out.printf("%s\n",s);
				n = s.length();
				for (i = n - 1;i >= 0;i--)
				{
					if (s.charAt(i) == '(')
					{
						for (j = i + 1;j < n;j++)
						{
							if (s.charAt(j) == ')')
							{
								s = tangible.StringFunctions.changeCharacter(s, i, 'a');
								s = tangible.StringFunctions.changeCharacter(s, j, 'a');
								break;
							}
						}
					}
				}
				for (i = 0;i < n;i++)
				{
					if (s.charAt(i) == '(' || s.charAt(i) == ')')
					{
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					for (i = 0;i < n;i++)
					{
					System.out.printf("%c",' ');
					}
					System.out.print("\n");
				}
				else
				{
					for (i = 0;i < n;i++)
					{
						if (s.charAt(i) == '(')
						{
							System.out.printf("%c",'$');
						}
						else if (s.charAt(i) == ')')
						{
							System.out.printf("%c",'?');
						}
						else
						{
							System.out.printf("%c",' ');
						}
					}
					System.out.print("\n");
				}
				s = tangible.StringFunctions.changeCharacter(s, 0, '\0');
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
		}
		return 0;
	}

}

