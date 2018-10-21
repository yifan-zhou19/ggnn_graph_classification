package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int a = 0; a < n; a++)
		{
			String b = new String(new char[256]);
			String c = new String(new char[256]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			int d = (int)b.length();
			for (int e = 0; e < d; e++)
			{
				if (b.charAt(e) == 'A')
				{
					c = tangible.StringFunctions.changeCharacter(c, e, 'T');
				}
				else if (b.charAt(e) == 'T')
				{
					c = tangible.StringFunctions.changeCharacter(c, e, 'A');
				}
				else if (b.charAt(e) == 'C')
				{
					c = tangible.StringFunctions.changeCharacter(c, e, 'G');
				}
				else if (b.charAt(e) == 'G')
				{
					c = tangible.StringFunctions.changeCharacter(c, e, 'C');
				}
			}
			c = tangible.StringFunctions.changeCharacter(c, d, '\0');
			System.out.printf("%s\n", c);
		}
		return 0;
	}
}

