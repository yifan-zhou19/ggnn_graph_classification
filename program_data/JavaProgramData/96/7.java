package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String bei = new String(new char[100]);
		char[] shang = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			bei = tempVar.charAt(0);
		}
		n = bei.length();
		if (n == 1)
		{
			System.out.print("0\n");
			System.out.printf("%c",bei.charAt(0));
		}
		else if (((bei.charAt(0) - '0') * 10 + bei.charAt(1) - '0') < 13 && bei.charAt(2) == 0)
		{
			System.out.print("0\n");
			for (i = 0;i < 2;i++)
			{
			System.out.printf("%c",bei.charAt(i));
			}
		}
		else
		{
		for (i = 0;i < n - 1;i++)
		{
			shang[i] = ((bei.charAt(i) - '0') * 10 + bei.charAt(i + 1) - '0') / 13 + '0';
			bei = tangible.StringFunctions.changeCharacter(bei, i + 1, ((bei.charAt(i) - '0') * 10 + bei.charAt(i + 1) - '0') % 13 + '0');
		}
		if (shang[0] != '0')
		{
			System.out.printf("%c",shang[0]);
		}
		for (i = 1;shang[i] != 0;i++)
		{
			System.out.printf("%c",shang[i]);
		}
		System.out.print("\n");
		if (bei.charAt(n - 1) >= '0' && bei.charAt(n - 1) <= '9')
		{
			System.out.printf("%d",bei.charAt(n - 1) - '0');
		}
		else
		{
			System.out.printf("%d",bei.charAt(n - 1) - '0');
		}
		}
		return 0;
	}

}

