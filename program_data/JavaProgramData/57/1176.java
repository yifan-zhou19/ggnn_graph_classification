package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[33]);
		int i;
		int j;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		m = a.length();
			if (a.charAt(m - 1) == 'r' && a.charAt(m - 2) == 'e')
			{
				a = a.substring(0, m - 2);
					System.out.printf("%s\n",a);

			}
			if (a.charAt(m - 1) == 'y' && a.charAt(m - 2) == 'l')
			{
				a = tangible.StringFunctions.changeCharacter(a, m - 2, '\0');
					System.out.printf("%s\n",a);

			}
			if (a.charAt(m - 1) == 'g' && a.charAt(m - 2) == 'n' && a.charAt(m - 3) == 'i')
			{
				a = tangible.StringFunctions.changeCharacter(a, m - 3, '\0');
					System.out.printf("%s\n",a);

			}
		if ((a.charAt(m - 1) != 'r' && a.charAt(m - 2) != 'e') && (a.charAt(m - 1) != 'y' && a.charAt(m - 2) != 'l') && (a.charAt(m - 1) != 'g' && a.charAt(m - 2) != 'n' && a.charAt(m - 3) != 'i'))
		{
				System.out.printf("%s\n",a);
		}

		}
	return 0;
	}
}

