package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[256]);
		int n;
		int i;
		int j;
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
				c = tempVar2.charAt(0);
			}
			for (j = 0;(c.charAt(j) != '\0');j++)
			{
				if (c.charAt(j) == 'A')
				{
					c = tangible.StringFunctions.changeCharacter(c, j, 'T');
				}
				else if (c.charAt(j) == 'T')
				{
					c = tangible.StringFunctions.changeCharacter(c, j, 'A');
				}
				else if (c.charAt(j) == 'C')
				{
					c = tangible.StringFunctions.changeCharacter(c, j, 'G');
				}
				else if (c.charAt(j) == 'G')
				{
					c = tangible.StringFunctions.changeCharacter(c, j, 'C');
				}
			}
			for (j = 0;(c.charAt(j) != '\0');j++)
			{
				System.out.printf("%c",c.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

