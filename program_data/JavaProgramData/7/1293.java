package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		String w = new String(new char[300]);
		String r = new String(new char[300]);
		String d = new String(new char[300]);
		int i;
		int j;
		int l;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			r = tempVar3.charAt(0);
		}
		l = s.length();
		h = w.length();
		for (i = 0;i <= l - h;i++)
		{
			for (j = 0;j < h;j++)
			{
				d = tangible.StringFunctions.changeCharacter(d, j, s.charAt(i + j));
			}
			d = tangible.StringFunctions.changeCharacter(d, h, '\0');
			if (strcmp(d,w) == 0)
			{
				break;
			}
		}
		if (i == l - h + 1)
		{
			System.out.printf("%s",s);
		}
		else
		{
			for (j = i;j < i + h;j++)
			{
				s = tangible.StringFunctions.changeCharacter(s, j, r.charAt(j - i));
			}
			System.out.printf("%s",s);
		}
		return 0;
	}

}

