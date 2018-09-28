package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String c = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		int i = 0;
		int j;
		for (i;i < (int)(w.length() - s.length());i++)
		{
				for (j = 0;j < (int)(s.length());j++)
				{
						c = tangible.StringFunctions.changeCharacter(c, j, w.charAt(i + j));
				}
				c = tangible.StringFunctions.changeCharacter(c, j, '\0');
				if (strcmp(c,s) == 0)
				{
				break;
				}
		}
		System.out.printf("%d",i);
		return 0;
	}

}

