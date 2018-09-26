package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String c = new String(new char[100]);
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			int k;
			for (k = 0;;k++)
			{
				if (c.charAt(k) == '\0')
				{
					break;
				}
			}
			if (c.charAt(k - 1) == 'r' || c.charAt(k - 1) == 'y')
			{
				c = tangible.StringFunctions.changeCharacter(c, k - 1, '\0');
				c = tangible.StringFunctions.changeCharacter(c, k - 2, '\0');
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, k - 1, '\0');
				c = tangible.StringFunctions.changeCharacter(c, k - 2, '\0');
				c = tangible.StringFunctions.changeCharacter(c, k - 3, '\0');
			}
			System.out.printf("%s\n",c);
		}
	}


}

