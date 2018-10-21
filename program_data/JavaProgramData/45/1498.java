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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		int n = s.length();
		int m = w.length();
		int i;
		int j;
		int l = 1;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, w.charAt(j + i));
			}
			c = tangible.StringFunctions.changeCharacter(c, j, '\0');
			l = strcmp(s,c);
			if (l == 0)
			{
				break;
			}
		}
		System.out.printf("%d",i);
		return 0;
	}
}

