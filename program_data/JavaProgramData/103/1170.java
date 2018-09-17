package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int u;
		int i;
		char t;
		String s = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		x = s.length();
		for (i = 0;i < x;i++)
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
			s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + 'A'-'a');
			}
		}
		u = 1;
		t = s.charAt(0);
		if (x == 1)
		{
		System.out.printf("(%c,%d)",t,u);
		}
		else if (x > 1)
		{
		for (i = 1;i < x;i++)
		{
			if (s.charAt(i) == t)
			{
				u++;
				if (i == x - 1)
				{
				System.out.printf("(%c,%d)",t,u);
				}
			}
			else
			{
				System.out.printf("(%c,%d)",t,u);
				t = s.charAt(i);
				u = 1;
				if (i == x - 1)
				{
				System.out.printf("(%c,%d)",t,u);
				}
			}
		}
		}
	}
}

