package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[11]);
		String b = new String(new char[4]);
		String c = new String(new char[14]);
		int i;
		int k;
		char p;
		for (;;)
		{
			for (i = 0;i < 11;i++)
			{
				a = a.substring(0, i);
			}
			for (i = 0;i < 4;i++)
			{
				b = b.substring(0, i);
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
			if (a.charAt(0) == '\0')
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			p = a.charAt(0);
			k = 0;
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (p < a.charAt(i))
				{
					p = a.charAt(i);
					k = i + 1;
				}
			}
			for (i = 0;i < k;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i));
			}
			for (i = 0;i < 3;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, k + i, b.charAt(i));
			}
			for (i = k;a.charAt(i) != '\0';i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i + 3, a.charAt(i));
			}
			System.out.printf("%s\n",c);
		}
	}
}

