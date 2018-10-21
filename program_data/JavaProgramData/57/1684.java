package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int i;
		int len;
		for (i = 0;i < m;i++)
		{
			String s1 = new String(new char[100]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1 = tempVar2.charAt(0);
			}
			len = s1.length();
			if ((int)s1.charAt(len - 1) == 114)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, len - 2, '\0');
				System.out.printf("%s\n", s1);
			}
			else if ((int)s1.charAt(len - 1) == 121)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, len - 2, '\0');
				System.out.printf("%s\n", s1);
			}
		   else
		   {
				s1 = tangible.StringFunctions.changeCharacter(s1, len - 3, '\0');
				System.out.printf("%s\n", s1);
		   }
		}
		return 0;
	}

}

