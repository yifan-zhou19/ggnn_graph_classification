package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		int i;
		int t;
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar);
			}
		if (c.charAt(i - 1) == ' ' && c.charAt(i) == ' ')
		{
			i--;
		}
		if (c.charAt(i) == '\n')
		{
			break;
		}
		}
		for (t = 0;t < i;t++)
		{
			System.out.printf("%c",c.charAt(t));
		}
		return 0;
	}
}

