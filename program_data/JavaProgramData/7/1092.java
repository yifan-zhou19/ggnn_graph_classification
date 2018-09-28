package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int c;
		int k = 1;
		String s = new String(new char[300]);
		String w = new String(new char[300]);
		String t = new String(new char[300]);
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
			t = tempVar3.charAt(0);
		}
		int l1 = s.length();
		int l2 = w.length();
		int l3 = t.length();
		for (i = 0;i < l2;i++)
		{
			c = 0;
			for (j = 0;j < l1;j++)
			{
				if (!(s.charAt(j) == w.charAt(j + i)))
				{
					c = 1;
					break;
				}
			}
			if ((c == 0) && (k) != 0)
			{
				for (j = i;j < i + l3;j++)
				{
					w = tangible.StringFunctions.changeCharacter(w, j, t.charAt(j - i));
				}
				k = 0;
			}
		}
		System.out.printf("%s",w);
		//scanf("%d",&i);
		return 0;
	}
}

