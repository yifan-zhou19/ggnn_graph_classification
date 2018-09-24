package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[233]);
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 'A'-'a');
			}
		}
		c = a.charAt(0);
		for (i = 0;c != '\0';i++)
		{
			for (j = 0;a.charAt(i) == c;j++)
			{
				i++;
			}
			if (j - i == 0)
			{
			j -= 1;
			}
			System.out.printf("(%c,%d)",c,j + 1);
			c = a.charAt(i);
		}
	}
}

