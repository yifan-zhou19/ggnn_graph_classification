package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[52]);
		String w = new String(new char[52]);
		int sc;
		int wc;
		int i;
		int j;
		int n = 0;
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
		sc = s.length();
		wc = w.length();
		for (i = 0;i < wc;i++)
		{
			if (s.charAt(0) == w.charAt(i))
			{
				n = 1;
				for (j = 1;j < sc;j++)
				{
					if (s.charAt(j) == w.charAt(i + j))
					{
						n++;
					}
				}
			}
			if (n == sc)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}

	}
}

