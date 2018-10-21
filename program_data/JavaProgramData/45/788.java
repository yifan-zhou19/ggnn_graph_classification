package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int a;
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
		n = s1.length();
		m = s2.length();
		for (j = 0;j < m;j++)
		{
			if (s1.charAt(0) != s2.charAt(j))
			{
				continue;
			}
			a = j;
			if (s1.charAt(0) == s2.charAt(j))
			{
				for (i = 1;i < n;i++,j++)
				{
					if (s1.charAt(i) != s2.charAt(j + 1))
					{
						break;
					}
				}
			}
			break;
		}
		System.out.printf("%d\n",a);
		return 0;
	}

}

