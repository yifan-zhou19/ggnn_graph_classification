package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf = new String(new char[256]);
		String hb = new String(new char[256]);
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
			for (int k = 0;k < 256;k++)
			{
				hb = tangible.StringFunctions.changeCharacter(hb, k, '\0');
			}
			for (int i = 0;zf.charAt(i);i++)
			{
				if (zf.charAt(i) == 'A')
				{
					hb = tangible.StringFunctions.changeCharacter(hb, i, 'T');
				}
				if (zf.charAt(i) == 'T')
				{
					hb = tangible.StringFunctions.changeCharacter(hb, i, 'A');
				}
				if (zf.charAt(i) == 'C')
				{
					hb = tangible.StringFunctions.changeCharacter(hb, i, 'G');
				}
				if (zf.charAt(i) == 'G')
				{
					hb = tangible.StringFunctions.changeCharacter(hb, i, 'C');
				}
			}
			System.out.printf("%s\n",hb);
		}
		return 0;
	}
}

