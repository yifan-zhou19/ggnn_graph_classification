package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String c = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			for (j = 0;j < c.length();j++)
			{
				  if (c.charAt(j) == 'A')
				  {
					  c = tangible.StringFunctions.changeCharacter(c, j, 'T');
					  continue;
				  }
				  if (c.charAt(j) == 'T')
				  {
					  c = tangible.StringFunctions.changeCharacter(c, j, 'A');
					  continue;
				  }
				  if (c.charAt(j) == 'C')
				  {
					  c = tangible.StringFunctions.changeCharacter(c, j, 'G');
					  continue;
				  }
				  if (c.charAt(j) == 'G')
				  {
					  c = tangible.StringFunctions.changeCharacter(c, j, 'C');
					  continue;
				  }
			}
				System.out.printf("%s",c);
			System.out.print("\n");
		}
		return 0;
	}
}

