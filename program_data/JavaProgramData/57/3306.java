package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int n;
		int j;
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
				a = tempVar2.charAt(0);
			}
			if (a.charAt(a.length() - 1) == 'r' && a.charAt(a.length() - 2) == 'e')
			{
				a = tangible.StringFunctions.changeCharacter(a, a.length() - 2, '\0');
			}
			if (a.charAt(a.length() - 1) == 'g' && a.charAt(a.length() - 2) == 'n' && a.charAt(a.length() - 3) == 'i')
			{
				a = tangible.StringFunctions.changeCharacter(a, a.length() - 3, '\0');
			}
			if (a.charAt(a.length() - 1) == 'y' && a.charAt(a.length() - 2) == 'l')
			{
				a = tangible.StringFunctions.changeCharacter(a, a.length() - 2, '\0');
			}
			System.out.printf("%s\n",a);
			for (j = 0;j < a.length();j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, '\0');
			}
		}
		return 0;
	}
}

