package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		int n;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (t = 0;t < 260;t++)
		{
			b = tangible.StringFunctions.changeCharacter(b, t, '\0');
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (t = 0;a.charAt(t) != '\0';t++)
			{
				if (a.charAt(t) == 'A')
				{
					b = tangible.StringFunctions.changeCharacter(b, t, 'T');
				}
				if (a.charAt(t) == 'C')
				{
					b = tangible.StringFunctions.changeCharacter(b, t, 'G');
				}
				if (a.charAt(t) == 'T')
				{
					b = tangible.StringFunctions.changeCharacter(b, t, 'A');
				}
				if (a.charAt(t) == 'G')
				{
					b = tangible.StringFunctions.changeCharacter(b, t, 'C');
				}
			}
			b = tangible.StringFunctions.changeCharacter(b, t, '\0');
			System.out.printf("%s\n",b);
		}
			return 0;
	}
}

