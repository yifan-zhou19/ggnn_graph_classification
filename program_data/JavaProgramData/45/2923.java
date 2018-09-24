package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[51]);
		String w = new String(new char[51]);
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
		int i;
		int j;
		int x;
		int l1;
		int l2;
		l1 = s.length();
		l2 = w.length();
		for (i = 0;i < l2;i++)
		{
			if (s.charAt(0) == w.charAt(i))
			{
				x = 0;
				for (j = 0;j < l1;j++)
				{
					if (s.charAt(j) != w.charAt(i + j))
					{
						break;
					}
					else
					{
						x = x + 1;
					}
				}
				if (x == l1)
				{
					System.out.printf("%d",i);
					return 0;
				}
			}
		}
		return 0;
	}
}

