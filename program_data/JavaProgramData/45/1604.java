package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int j;
		int k = 0;
		int a = 70;
		int ls;
		int lw;
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
		ls = s.length();
		lw = w.length();
		for (i = 0;i < lw;i++)
		{
			if (s.charAt(0) == w.charAt(i) && k == 0)
			{
				k = 1;
				for (j = 1;j < ls;j++)
				{
					if (s.charAt(j) != w.charAt(i + j))
					{
						k = 0;
					}
				}
			}
			if (k == 1 && i < a)
			{
				a = i;
			}
		}
		System.out.printf("%d",a);
	}
}

