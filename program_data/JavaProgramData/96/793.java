package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String asd = new String(new char[300]);
		String zxc = new String(new char[300]);
		int n = 0;
		int m = 0;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			asd = tempVar.charAt(0);
		}
		int len = asd.length();
		m = asd.charAt(0) - 48;
		for (i = 1;i < len;i++)
		{
			n = 10 * m + asd.charAt(i) - 48;
			zxc = tangible.StringFunctions.changeCharacter(zxc, i - 1, n / 13 + 48);
			m = n % 13;
		}
		zxc = tangible.StringFunctions.changeCharacter(zxc, len - 1, '\0');
		for (i = 0;i < len - 1;i++)
		{
			if (zxc.charAt(i) != '0')
			{
				break;
			}
			else
			{
				for (j = 0;j < len - 1;j++)
				{
					zxc = tangible.StringFunctions.changeCharacter(zxc, j, zxc.charAt(j + 1));
				}
			}
		}
		if (zxc.charAt(0) == '\0')
		{
			zxc = tangible.StringFunctions.changeCharacter(zxc, 0, '0');
			zxc = tangible.StringFunctions.changeCharacter(zxc, 1, '\0');
		}
		System.out.printf("%s\n%d\n",zxc,m);
		return 0;
	}
}

