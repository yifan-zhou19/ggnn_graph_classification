package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[35]);
		String s2 = new String(new char[35]);
		int n;
		int i;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s1 = new Scanner(System.in).nextLine();
		while (n-- != 0)
		{
			s1 = new Scanner(System.in).nextLine();
			l = s1.length();
			if (s1.charAt(l - 1) == 'r')
			{
				for (i = 0;i < l - 2;i++)
				{
					s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(i));
					if (i < l - 3)
					{
						System.out.printf("%c",s2.charAt(i));
					}
					else
					{
						System.out.printf("%c\n",s2.charAt(i));
					}
				}
			}
			else if (s1.charAt(l - 1) == 'y')
			{
				for (i = 0;i < l - 2;i++)
				{
					s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(i));
						if (i < l - 3)
						{
						System.out.printf("%c",s2.charAt(i));
						}
					else
					{
						System.out.printf("%c\n",s2.charAt(i));
					}
				}
			}
			else if (s1.charAt(l - 1) == 'g')
			{
				for (i = 0;i < l - 3;i++)
				{
					s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(i));
						if (i < l - 4)
						{
						System.out.printf("%c",s2.charAt(i));
						}
					else
					{
						System.out.printf("%c\n",s2.charAt(i));
					}
				}
			}




		}

		return 0;
	}
}

