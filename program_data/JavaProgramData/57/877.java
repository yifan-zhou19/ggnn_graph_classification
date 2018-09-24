package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf = new String(new char[21]);
		int l;
		int n;
		int judge = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zf = tempVar2.charAt(0);
			}
			l = zf.length();
			if (zf.charAt(l - 1) == 'r')
			{
				zf = tangible.StringFunctions.changeCharacter(zf, l - 2, '\0');
			}
			if (zf.charAt(l - 1) == 'y')
			{
				zf = tangible.StringFunctions.changeCharacter(zf, l - 2, '\0');
			}
			if (zf.charAt(l - 1) == 'g')
			{
				zf = tangible.StringFunctions.changeCharacter(zf, l - 3, '\0');
			}
			System.out.printf("%s\n",zf);
		}
		return 0;
	}
}

