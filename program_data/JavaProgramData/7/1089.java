package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int m;
		int k;
		int p;
		String r = new String(new char[257]);
		String s = new String(new char[257]);
		String w = new String(new char[257]);
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
			r = tempVar3.charAt(0);
		}
		a = s.length();
		p = 0;
		for (i = 0;w.charAt(i);i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				m = 0;
				for (j = 0;j < a;j++)
				{
					if (w.charAt(i + j) == s.charAt(j))
					{
						m = m + 1;
					}
				}
				if (m == a)
				{
					p = p + 1;
					for (k = 0;k < a;k++)
					{
						w = tangible.StringFunctions.changeCharacter(w, i + k, r.charAt(k));
					}
					System.out.printf("%s",w);
					break;
				}
			}
		}
		if (p == 0)
		{
			System.out.printf("%s",w);
		}
		return 0;
	}

}

