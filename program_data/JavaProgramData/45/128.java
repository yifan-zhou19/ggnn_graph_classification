package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int a;
		int ls;
		int lw;
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		ls = s.length();
		lw = w.length();
		for (j = 0;j < lw;j++)
		{
			if (s.charAt(0) == w.charAt(j))
			{
				t = 0;
				a = j;
				for (i = 0;i < ls;i++)
				{
				   if (s.charAt(i) != w.charAt(j + i))
				   {
					   t = 1;
				   }
				   break;
				}
			}
			if (t == 1)
			{
				break;
			}
			if (t == 0)
			{
				break;
			}
		}
		System.out.printf("%d\n", a);
		return 0;
	}
}

