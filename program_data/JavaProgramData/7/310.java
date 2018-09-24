package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		int i;
		int j;
		int lena;
		int lenb;
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
		lena = a.length();
		lenb = b.length();
		a = tangible.StringFunctions.changeCharacter(a, lena, '\0');
		int x;
		int s;
		for (i = 0;i < lena;i++)
		{
			x = -1;
			for (j = 0;j < lenb;j++)
			{
				if (a.charAt(i + j) != b.charAt(j))
				{
					x = 0;
					break;
				}
			}
			if (x != 0)
			{
				s = i;
				break;
			}
		}
		if (x == 0)
		{
			System.out.printf("%s",a);
		}
		else
		{
			for (i = 0;i < s;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			System.out.printf("%s",c);
			for (i = s + lenb;i < lena;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
		return 0;
	}

}

