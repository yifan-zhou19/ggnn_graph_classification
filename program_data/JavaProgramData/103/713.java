package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		char c;
		String s = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;i <= 999;i++)
		{
			if (s.charAt(i) > 'Z')
			{
			s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 32);
			}
		}
			c = s.charAt(0);
			j = 1;
			for (i = 1;i <= s.length();i++)
			{
				if (s.charAt(i) == c)
				{
				j++;
				}
				else
				{
					System.out.printf("(%c,%d)",c,j);
					j = 1;
					c = s.charAt(i);

				}

			}
			return 0;

	}

}

