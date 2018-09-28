package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		int s = 0;
		String a = new String(new char[60]);
		String b = new String(new char[60]);
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		m = b.length();
		for (i = 0;i < m - n;i++)
		{
			if (a.charAt(0) == b.charAt(i))
			{
				for (j = 0;j < n;j++)
				{
					if (a.charAt(j) == b.charAt(i + j))
					{
						s = s + 1;
					}
				}
			}
			if (s == n)
			{
				break;
			}
			s = 0;
		}
		System.out.printf("%d",i);
	}
}

