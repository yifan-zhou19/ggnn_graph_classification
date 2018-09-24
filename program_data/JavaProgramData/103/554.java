package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int num = 1;
		String c = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if (c.charAt(i + 1) == c.charAt(i) || Math.abs(c.charAt(i + 1) - c.charAt(i)) == 32)
			{
				num += 1;
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, (c.charAt(i) > 96)?(c.charAt(i) - 32):c.charAt(i));
				System.out.printf("(%c,%d)",c.charAt(i),num);
				num = 1;
			}
		}
		System.out.print("\n");
		return (0);
	}

}

