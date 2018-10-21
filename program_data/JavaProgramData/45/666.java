package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[51]);
		String w = new String(new char[51]);
		int l;
		int m;
		int i;
		int j;
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
		m = w.length();
		for (i = 0;i <= m - l;i++)
		{
				if (w.charAt(i) == s.charAt(0))
				{
						for (j = 0;j < l;j++)
						{
							if (w.charAt(i + j) != s.charAt(j))
							{
							break;
							}
						}
						if (j == l)
						{
							System.out.printf("%d",i);
							break;
						}
				}

		}

	}
}

