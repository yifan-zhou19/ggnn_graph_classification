package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int result = 0;
		int len1;
		int len2;
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
		len1 = w.length();
		len2 = s.length();
		for (i = 0;i < len1;i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				for (j = i;j < i + len2 && j < len1;j++)
				{
					if (w.charAt(j) != s.charAt(j - i))
					{
						result = 1;
					}
				}
				if (result == 0)
				{
					System.out.printf("%d",i);
					return 0;
				}
			}

		}

	 return 0;
	}


}

