package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		String a = new String(new char[33]);
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
			if (len > 3)
			{
			if (a.charAt(len - 1) == 'r' && a.charAt(len - 2) == 'e')
			{
				a = tangible.StringFunctions.changeCharacter(a, len - 2, '\0');
			}
			if (a.charAt(len - 1) == 'y' && a.charAt(len - 2) == 'l')
			{
				a = tangible.StringFunctions.changeCharacter(a, len - 2, '\0');
			}
			if (a.charAt(len - 1) == 'g' && a.charAt(len - 2) == 'n' && a.charAt(len - 3) == 'i')
			{
				a = tangible.StringFunctions.changeCharacter(a, len - 3, '\0');
			}
			}
			System.out.printf("%s\n",a);
			if (len <= 3)
			{
				System.out.printf("%s\n",a);
			}
		}
		return 0;
	}
}

