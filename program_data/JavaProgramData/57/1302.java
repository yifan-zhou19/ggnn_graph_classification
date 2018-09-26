package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		String s = new String(new char[33]);
		len = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
		len = s.length();
		for (j = len - 1;s.charAt(j) != '\0';j--)
		{
			if (s.charAt(j) == 'y')
			{
				s = tangible.StringFunctions.changeCharacter(s, j - 1, '\0');
				break;
			}
			else if (s.charAt(j) == 'g')
			{
				s = tangible.StringFunctions.changeCharacter(s, j - 2, '\0');
				break;
			}
			else if (s.charAt(j) == 'r')
			{
				s = tangible.StringFunctions.changeCharacter(s, j - 1, '\0');
				break;
			}


		}
		System.out.printf("%s\n",s);
		}
		return 0;

	}

}

