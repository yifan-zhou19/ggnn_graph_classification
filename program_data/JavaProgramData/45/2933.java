package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[51]);
		String w = new String(new char[51]);
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
		int m;
		int n;
		int t;
		m = s.length();
		n = w.length();
		for (int i = 0;i < n - m + 1;i++)
		{
			t = 0;
			for (int j = 0;j < m;j++)
			{
				if (s.charAt(j) != w.charAt(i + j))
				{
					t = 1;
					break;
				}
			}
			if (t == 0)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
	}
}

