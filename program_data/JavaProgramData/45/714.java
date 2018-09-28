package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p1;
		String p2;
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int j;
		int m;
		int n;
		p1 = a;
		p2 = b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p2 = tempVar2.charAt(0);
		}
		m = a.length();
		n = b.length();
		for (i = 0;i < n;i++,p2++)
		{
			if (*p2 == *p1)
			{
				for (j = 0;j < m;j++)
				{
					if (p2.charAt(j) != p1.charAt(j))
					{
						break;
					}
				}
			}
			if (j == m)
			{
				break;
			}
		}
		System.out.printf("%d",i);
	}
}

