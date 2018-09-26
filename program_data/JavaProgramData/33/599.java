package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		char a;
		char b;
		char c;
		char d;
		a = 'A';
		b = 'T';
		c = 'G';
		d = 'C';
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			for (j = 0;s.charAt(j);j++)
			{
				if (s.charAt(j) == a)
				{
					s = tangible.StringFunctions.changeCharacter(s, j, b);
				}
				else if (s.charAt(j) == b)
				{
					s = tangible.StringFunctions.changeCharacter(s, j, a);
				}
				else if (s.charAt(j) == c)
				{
					s = tangible.StringFunctions.changeCharacter(s, j, d);
				}
				else if (s.charAt(j) == d)
				{
					s = tangible.StringFunctions.changeCharacter(s, j, c);
				}

			}
			System.out.printf("%s\n",s);


		}






		return 0;

	}
}

