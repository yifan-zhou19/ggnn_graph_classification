package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		int h;
		String s = new String(new char[60]);
		String w = new String(new char[60]);
		String b = new String(new char[60]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		l = s.length();
		h = w.length();
		for (i = 0;i <= l - h;i++)
		{
			for (j = 0;j < h;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, s.charAt(i + j));
			}
			b = tangible.StringFunctions.changeCharacter(b, h, '\0');
			if (strcmp(b,w) == 0)
			{
				System.out.printf("%d",i);
				break;
			}
			for (j = 0;j < 60;j++)
			{
				b = b.substring(0, j);
			}
		}
		return 0;
	}

}

