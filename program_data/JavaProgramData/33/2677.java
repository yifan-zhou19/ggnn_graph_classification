package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (x = 0;x < n;x++)
		{
			final String c = "";
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			int i;
			int len;
			len = c.length();
			for (i = 0;i < len;i++)
			{
				if (c.charAt(i) == 'A')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, 'T');
					continue;
				}
				if (c.charAt(i) == 'T')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, 'A');
					continue;
				}
				if (c.charAt(i) == 'C')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, 'G');
					continue;
				}
				if (c.charAt(i) == 'G')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, 'C');
					continue;
				}
			}
			if (x < n - 1)
			{
			System.out.printf("%s\n",c);
			}
			else
			{
				System.out.printf("%s",c);
			}
		}
		return 0;
	}
}

