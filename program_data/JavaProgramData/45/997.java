package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[200]);
		String w = new String(new char[200]);
		int i;
		int j;
		int lens;
		int lenw;

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
		lens = s.length();
		lenw = w.length();
		for (i = 0; i < lens; i++)
		{
			for (j = 0; j < lenw; j++)
			{
				if (s.charAt(i + j) != w.charAt(j))
				{
					break;
				}
			}
			if (j == lenw)
			{
				System.out.printf("%d", i);
				return 0;
			}
		}

		return 0;
	}

}

