package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String t = new String(new char[100]);
		int lenb;
		int lena;
		int len;
		int i = 0;
		int j;
		int k;
		int flag;
		c = new Scanner(System.in).nextLine();
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
		len = c.length();
		lena = a.length();
		lenb = b.length();
		while (i < len)
		{
			j = 0;
			while (isgraph(c.charAt(i)))
			{
				t = tangible.StringFunctions.changeCharacter(t, j++, c.charAt(i++));
			}
			t = tangible.StringFunctions.changeCharacter(t, j, '\0');
			if (strcmp(t,a))
			{
				System.out.printf("%s",t);
			}
			else
			{
				System.out.printf("%s",b);
			}
			if (c.charAt(i) != null)
			{
				System.out.printf("%c",c.charAt(i++));
			}
		}
		return 0;
	}

}

