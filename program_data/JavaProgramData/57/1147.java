package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[32]);
		String b = new String(new char[32]);
		int n;
		int i;
		int j;
		int len;
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
			len = a.length();
			if ((a.charAt(len - 1) == 'r' && a.charAt(len - 2) == 'e') || (a.charAt(len - 1) == 'y' && a.charAt(len - 2) == 'l'))
			{
				for (j = 0;j < len - 2;j++)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(j));
				}
				b = tangible.StringFunctions.changeCharacter(b, j, '\0');
				System.out.printf("%s\n", b);
			}
			if (a.charAt(len - 1) == 'g' && a.charAt(len - 2) == 'n' && a.charAt(len - 3) == 'i')
			{
				for (j = 0;j < len - 3;j++)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(j));
				}
				b = tangible.StringFunctions.changeCharacter(b, j, '\0');
				System.out.printf("%s\n", b);
			}
		}
		return 0;
	}

}

