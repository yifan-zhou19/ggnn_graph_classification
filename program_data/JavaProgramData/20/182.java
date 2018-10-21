package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		String a = new String(new char[11]);
		String b = new String(new char[3]);
		String c = new String(new char[14]);
		for (j = 0;j < 10;j++)
		{
		for (i = 0;i < 11;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		}
		for (i = 0;i < 3;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
		}
		for (i = 0;i < 14;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, '\0');
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 0,n = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) > a.charAt(n))
			{
				n = i;
			}
		}
		c = a.substring(0, n + 1);
		c = tangible.StringFunctions.changeCharacter(c, n + 1, b.charAt(0));
		c = tangible.StringFunctions.changeCharacter(c, n + 2, b.charAt(1));
		c = tangible.StringFunctions.changeCharacter(c, n + 3, b.charAt(2));
		for (i = n + 1;a.charAt(i) != '\0';i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i + 3, a.charAt(i));
		}
		System.out.printf("%s\n",c);
		}
	}
}

