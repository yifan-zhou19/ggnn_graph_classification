package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[51]);
		String w = new String(new char[51]);
		int i;
		int k;
		int n;
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
		int l = s.length();
		for (i = 0 ; i <= 50 && n != 0 ; i++)
		{
			n = 0;
			for (k = 0 ; k <= l - 1 ; k++)
			{
				if (s.charAt(k) == w.charAt(k + i))
				{
					n = n;
				}
				else
				{
					n = n + 1;
				}
			}
			if (n == 0)
			{
				System.out.printf("%d", i);
			}
		}
		return (0);

	}
}

