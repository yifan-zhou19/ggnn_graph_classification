package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String s = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n + 1;i++)
		{
			s = new Scanner(System.in).nextLine();
			for (j = 0;s.charAt(j) != 0;j++)
			{
				if (s.charAt(j) == 'e' && s.charAt(j + 1) == 'r' && s.charAt(j + 2) == 0)
				{
					s = tangible.StringFunctions.changeCharacter(s, j, s[j + 1] = 0);
				}
				if (s.charAt(j) == 'l' && s.charAt(j + 1) == 'y' && s.charAt(j + 2) == 0)
				{
					s = tangible.StringFunctions.changeCharacter(s, j, s[j + 1] = 0);
				}
				if (s.charAt(j) == 'i' && s.charAt(j + 1) == 'n' && s.charAt(j + 2) == 'g' && s.charAt(j + 3) == 0)
				{
					s = tangible.StringFunctions.changeCharacter(s, j, s[j + 1] = s[j + 2] = 0);
				}

			}
			System.out.println(s);
		}
		return 0;
	}


}

