package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		String s1 = new String(new char[101]);
		char[] s2 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		for (i = 1;i > 0;)
		{
			s1 = new Scanner(System.in).nextLine();
			if (strcmp(s1,s2) == 0)
			{
				System.out.print("\n");
				break;
			}
			System.out.println(s1);
			l = s1.length();
			for (j = 0;j < l;j++)
			{
				if (s1.charAt(j) != '(' && s1.charAt(j) != ')')
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, j, ' ');
				}
				else
				{
					if (s1.charAt(j) == ')')
					{
						for (k = j;k >= 0;k--)
						{
							if (s1.charAt(k) == '(')
							{
								break;
							}
						}
						if (k != -1)
						{
							s1 = tangible.StringFunctions.changeCharacter(s1, k, s1[j] = ' ');
						}
						else
						{
							s1 = tangible.StringFunctions.changeCharacter(s1, j, '?');
						}
					}
				}
			}
			for (j = 0;j < l;j++)
			{
				if (s1.charAt(j) == '(')
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, j, '$');
				}
			}
			s2 = s1;
			System.out.println(s1);
		}
		return 0;
	}


}

