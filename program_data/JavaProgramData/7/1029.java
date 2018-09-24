package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String sub = new String(new char[206]);
		String re = new String(new char[256]);
		int i;
		int j;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sub = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			re = tempVar3.charAt(0);
		}
		n = sub.length();
		m = s.length();
		for (i = 0;i < m - n + 1;i++)
		{
			if (s.charAt(i) == sub.charAt(0))
			{
			for (j = 0;j < n;j++)
			{
				if (s.charAt(i + j) != sub.charAt(j))
				{
				break;
				}
			}
			}
			if (j == n)
			{
				for (j = 0;j < i;j++)
				{
				System.out.printf("%c",s.charAt(j));
				}
				System.out.printf("%s",re);
				for (j = i + n;j < m;j++)
				{
				System.out.printf("%c",s.charAt(j));
				}
				break;
			}
		}
		if (i == (1 + m - n))
		{
		System.out.printf("%s",s);
		}
	}

}

