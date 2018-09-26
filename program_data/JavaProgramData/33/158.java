package <missing>;

public class GlobalMembers
{
	public static char hb(char a)
	{
		if (a == 'A')
		{
			a = 'T';
		}
		else if (a == 'T')
		{
			a = 'A';
		}
		else if (a == 'C')
		{
			a = 'G';
		}
		else if (a == 'G')
		{
			a = 'C';
		}
		return a;
	}

	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int z = 0;z < n;z++)
		{
			final String s = "";
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			int length;
			length = s.length();
			for (int i = 0;i < length;i++)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, hb(s.charAt(i)));
			}
			System.out.printf("%s\n",s);
		}
		return 0;
	}

}

