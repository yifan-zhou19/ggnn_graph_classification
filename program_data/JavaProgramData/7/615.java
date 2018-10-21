package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int j = 0;
		int l1;
		int l2;
		int e = 0;
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		String d = new String(new char[256]);
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		l = a.length();
		l1 = b.length();
		l2 = c.length();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (e == 0)
			{
			if (a.charAt(i) == b.charAt(j))
			{
				d = tangible.StringFunctions.changeCharacter(d, j, a.charAt(i));
				j++;
			}
			else
			{
				if (j != 0 && e != 1)
				{
					d = tangible.StringFunctions.changeCharacter(d, j, '\0');
					System.out.printf("%s",d);
				}
				j = 0;
				System.out.printf("%c",a.charAt(i));
			}
			if (j == l1 && e == 0)
			{
				System.out.printf("%s",c);
				i = i - l1 + l2;
				e = 1;
			}
			}
			else
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
		return 0;
	}
}

