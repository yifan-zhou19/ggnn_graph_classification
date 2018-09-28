package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int LEN = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String zf = new String(new char[256]);
		for (i = 0;i < n;i++)
		{
			j = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zf = tempVar2.charAt(0);
			}
			LEN = zf.length();
			while (j < LEN)
			{
				if (zf.charAt(j) == 'A')
				{
					zf = tangible.StringFunctions.changeCharacter(zf, j, 'T');
				}
				else if (zf.charAt(j) == 'T')
				{
					zf = tangible.StringFunctions.changeCharacter(zf, j, 'A');
				}
				else if (zf.charAt(j) == 'C')
				{
					zf = tangible.StringFunctions.changeCharacter(zf, j, 'G');
				}
				else if (zf.charAt(j) == 'G')
				{
					zf = tangible.StringFunctions.changeCharacter(zf, j, 'C');
				}
				j++;
			}
			System.out.printf("%s\n",zf);
		}
		return 0;
	}

}

