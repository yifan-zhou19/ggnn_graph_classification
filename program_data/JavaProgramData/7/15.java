package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int k;
		String s = new String(new char[256]);
		String w = new String(new char[256]);
		String c = new String(new char[256]);
		String x = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		t = s.length();
		for (i = 0;w.charAt(i) != '\0';i++)
		{
			for (j = 0;j < t;j++)
			{
				x = tangible.StringFunctions.changeCharacter(x, j, w.charAt(i + j));
			}
			x = tangible.StringFunctions.changeCharacter(x, j, '\0');
			if (strcmp(s,x) == 0)
			{
				for (k = 0;k < t;k++)
				{
					w = tangible.StringFunctions.changeCharacter(w, i + k, c.charAt(k));
				}
				break;
			}
		}
		System.out.printf("%s",w);
		return 0;
	}
}

