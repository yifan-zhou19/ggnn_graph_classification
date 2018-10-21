package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		int i;
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if ((c.charAt(i) >= 'a') && (c.charAt(i) <= 'z'))
			{
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + 'A'-'a');
			}
		}
		int m;
		int n;
		n = 1;
		for (m = 0;c.charAt(m) != '\0';m++)
		{
			if (c.charAt(m) != c.charAt(m + 1))
			{
				System.out.printf("(%c,%d)",c.charAt(m),n);
				n = 1;
			}
			else
			{
			n++;
			}
		}
	}

}

