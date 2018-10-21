package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String sz = "";
		final String s = "";
		final String w = "";
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
		int i = 0;
		int j = 0;
		int k = 0;

		for (i = 0;i < w.length();i++)
		{
			if (s.charAt(0) == w.charAt(i))
			{
				k = i;
				for (j = 0;j < s.length();j++,k++)
				{
					if (s.charAt(j) != w.charAt(k))
					{
						break;
					}
				}
			}
			if (j == s.length())
			{
				System.out.printf("%d",i);
				break;
			}
		}

		return 0;
	}

}

