package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n = 0;
		String d = new String(new char[5]);
		String c = new String(new char[5]);
		for (i = 0;i < 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, tempVar);
			}
			if (d.charAt(i) >= 48 && d.charAt(i) <= 57)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, d.charAt(i));
				n++;
			}
			else
			{
				break;
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			System.out.printf("%c",c.charAt(i));
		}
		return 0;
	}
}

