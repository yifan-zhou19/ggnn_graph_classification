package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int s;
		int n;
		String c = new String(new char[1000]);
		for (i = 0,n = 0;;i++)
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
			n++;
		}
		for (i = 0;i < n - 1;i++)
		{
			s = c.charAt(i) + c.charAt(i + 1);
			System.out.printf("%c",s);
		}
		s = c.charAt(n - 1) + c.charAt(0);
		System.out.printf("%c",s);
		return 0;
	}
}

