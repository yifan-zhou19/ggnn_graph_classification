package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int k;
		int l1;
		String s1 = new String(new char[26]);
		String s2 = new String(new char[26]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		l1 = s1.length();
		for (i = 0;s2.charAt(i);i++)
		{
			if (s1.charAt(0) == s2.charAt(i))
			{
				k = 0;
				for (j = 1;s1.charAt(j);j++)
				{
					if (s1.charAt(j) != s2.charAt(j + i))
					{
						k = 1;
					}
				}
				if (k == 0)
				{
					System.out.printf("%d\n", i);
					break;
				}
			}
		}
		return 0;
	}
}

