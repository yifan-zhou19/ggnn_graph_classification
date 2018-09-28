package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		String c = new String(new char[30]);
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar);
			}
			if (c.charAt(i) == '\n')
			{
				break;
			}
		}
		if ('0' <= c.charAt(0) && c.charAt(0) < '9')
		{
			System.out.printf("%c",c.charAt(0));
		}
		for (m = 1;m < i;m++)
		{
			if (c.charAt(m) < '0' || c.charAt(m)>'9')
			{
				if ('0' <= c.charAt(m - 1) && c.charAt(m - 1) <= '9')
				{
				System.out.print("\n");
				}
			}
			else if ('0' <= c.charAt(m) <= '9')
			{
				System.out.printf("%c",c.charAt(m));
			}
		}
		return 0;
	}
}

