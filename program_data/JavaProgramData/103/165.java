package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int i;
		int m;
		int k;
		int p;
		m = 'A'-'a';
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + m);
			}
			else
			{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i));
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, i, '\0');
		p = 1;
		for (k = 0;b.charAt(k + 1) != '\0';k++)
		{
			if (b.charAt(k) == b.charAt(k + 1))
			{
				p = p + 1;
			}
			else
			{
				System.out.printf("(%c,%d)",b.charAt(k),p);
				p = 1;
			}
		}
		System.out.printf("(%c,%d)",b.charAt(k),p);
	}
}

