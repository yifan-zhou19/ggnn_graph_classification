package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int j;
		int c;
		String s = new String(new char[1000]);
		String a = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (c = 0;c < 1000;c++)
			{
				s = s.substring(0, c);
				a = a.substring(0, c);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			p = s.length();
			for (j = 0;j < p;j++)
			{
				if (s.charAt(j) == 'A')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'T');
				}
				else if (s.charAt(j) == 'T')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'A');
				}
				else if (s.charAt(j) == 'G')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'C');
				}
				else if (s.charAt(j) == 'C')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'G');
				}
			}
			System.out.printf("%s\n",a);
		}
		return 0;
	}

}

