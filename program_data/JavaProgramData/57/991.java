package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i;
		int k;
		String c = new String(new char[M]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (k = 0;k < n + 1;k++)
		{
			c = new Scanner(System.in).nextLine();

			len = c.length();
			if (c.charAt(len - 2) == 'e')
			{
				c = tangible.StringFunctions.changeCharacter(c, len - 2, '\0');
				System.out.printf("%s\n",c);
			}
			else
			{
			if (c.charAt(len - 2) == 'l')
			{
				c = tangible.StringFunctions.changeCharacter(c, len - 2, '\0');
				System.out.printf("%s\n",c);
			}
			else
			{
			if (c.charAt(len - 3) == 'i')
			{
				c = tangible.StringFunctions.changeCharacter(c, len - 3, '\0');
				System.out.printf("%s\n",c);
			}
			}
			}
		}

		return 0;
	}

}

