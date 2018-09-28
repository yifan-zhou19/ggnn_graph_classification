package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String m = new String(new char[50]);
		int i;
		int j;
		int l;
		int t;
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
		l = s.length();
		t = w.length();
		for (i = 0;i < t;i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				for (j = 0;j < l;j++)
				{
					m = tangible.StringFunctions.changeCharacter(m, j, w.charAt(i + j));
				}
				m = tangible.StringFunctions.changeCharacter(m, j, '\0');
				if (strcmp(m,s) == 0)
				{
					System.out.printf("%d",i);
					break;
				}
			}
		}
	}

}

