package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String t = new String(new char[50]);
		int i;
		int j;
		int l;
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
		for (i = 0;;i++)
		{
			for (j = 0;j < l;j++)
			{
				t = tangible.StringFunctions.changeCharacter(t, j, w.charAt(i + j));
			}
			t = t.substring(0, l);
			if (!strcmp(s,t))
			{
				break;
			}
		}
		System.out.printf("%d\n",i);
	}
}

