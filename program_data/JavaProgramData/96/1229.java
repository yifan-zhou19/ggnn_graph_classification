package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int u;
		String a = new String(new char[101]);
		for (u = 0;u < 100;u++)
		{
			a = tangible.StringFunctions.changeCharacter(a, u, '\0');
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String shang = new String(new char[101]);
		for (u = 0;u < 100;u++)
		{
			shang = tangible.StringFunctions.changeCharacter(shang, u, '\0');
		}
		int yu = 0;
		int i;
		int j;
		if (a.length() == 1)
		{
			shang = tangible.StringFunctions.changeCharacter(shang, 0, '0');
			yu = a.charAt(0) - '0';
		}
		else if (a.length() == 2)
		{
			shang = tangible.StringFunctions.changeCharacter(shang, 0, ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) / 13 + '0');
			yu = ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) % 13;
		}
		else if ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0') < 13)
		{
			shang = tangible.StringFunctions.changeCharacter(shang, 0, ((a.charAt(0) - '0') * 100 + (a.charAt(1) - '0') * 10 + (a.charAt(2) - '0') + yu) / 13 + '0');
			yu = ((a.charAt(0) - '0') * 100 + (a.charAt(1) - '0') * 10 + (a.charAt(2) - '0') + yu) % 13;
			for (i = 1;i + 2 < a.length();i++)
			{
				shang = tangible.StringFunctions.changeCharacter(shang, i, ((a.charAt(i + 2) - '0') + yu * 10) / 13 + '0');
				yu = ((a.charAt(i + 2) - '0') + yu * 10) % 13;
			}
		}
		else
		{
			yu = a.charAt(0) - '0';
			for (i = 0;i + 1 < a.length();i++)
			{
				shang = tangible.StringFunctions.changeCharacter(shang, i, (a.charAt(i + 1) - '0' + yu * 10) / 13 + '0');
				yu = (a.charAt(i + 1) - '0' + yu * 10) % 13;
			}
		}
		System.out.printf("%s\n%d\n",shang,yu);
	}
}

