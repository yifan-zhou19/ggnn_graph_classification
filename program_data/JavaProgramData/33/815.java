package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[256]);
		String zfcsc = new String(new char[256]);
		int n;
		char a = 'A';
		char t = 'T';
		char g = 'G';
		char c = 'C';
	//	char x,y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			for (int j = 0;j < 256;j++)
			{
				if (zfc.charAt(j) == a)
				{
					zfcsc = tangible.StringFunctions.changeCharacter(zfcsc, j, t);
				}
				else if (zfc.charAt(j) == t)
				{
					zfcsc = tangible.StringFunctions.changeCharacter(zfcsc, j, a);
				}
				else if (zfc.charAt(j) == g)
				{
					zfcsc = tangible.StringFunctions.changeCharacter(zfcsc, j, c);
				}
				else if (zfc.charAt(j) == c)
				{
					zfcsc = tangible.StringFunctions.changeCharacter(zfcsc, j, g);
				}
				else if (zfc.charAt(j) == '\0')
				{
					zfcsc = tangible.StringFunctions.changeCharacter(zfcsc, j, '\0');
				}
			}
			System.out.printf("%s\n",zfcsc);
		}
		return 0;
	}

}

