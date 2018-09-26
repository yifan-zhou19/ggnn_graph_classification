package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String w = new String(new char[10000]);
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
		int i;
		int j;
		int k;
		int a;
		a = 1;
		m = s.length();
		n = w.length();
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (s.charAt(i) == w.charAt(j))
				{
					for (k = 1;k < m;k++)
					{
						if (s.charAt(i + k) == w.charAt(j + k))
						{
							a = a + 1;
						}
					}
					if (a == m)
					{
						System.out.printf("%d",j);
						return 0;
					}
				}
			}
		}

		return 0;
	}
}

