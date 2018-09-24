package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
		int i;
		int k;
		int x = 0;
		int m;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		for (i = 0;(c = s2.charAt(i)) != '\0';i++)
		{
			if (s1.charAt(0) == s2.charAt(i))
			{
				for (k = i + 1;k < s1.length();k++)
				{
					if (s1.charAt(k - i) != s2.charAt(k))
					{
						x = 1;
					}
				}
				if (x != 1)
				{
					m = i;
					break;
				}
			}
		}
		System.out.printf("%d",m);
		return 0;
	}
}

