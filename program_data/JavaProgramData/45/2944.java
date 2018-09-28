package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
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
		int l1;
		int l2;
		int i;
		int j;
		int p;
		l1 = s1.length();
		l2 = s2.length();
		for (i = 0;i <= (l2 - l1);i = i + 1)
		{
			if (s2.charAt(i) == s1.charAt(0))
			{
				p = 0;
				for (j = 1;j < l1;j = j + 1)
				{
					if (s1.charAt(j) != s2.charAt(j + i))
					{
						p = 1;
						break;
					}
				}
				if (p == 0)
				{
					break;
				}
			}
		}
		System.out.printf("%d",i);
		return 0;
	}

}

