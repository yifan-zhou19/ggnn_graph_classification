package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
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
		int sl;
		int wl;
		int i;
		int j;
		int p;
		sl = s.length();
		wl = w.length();
		for (i = 0,j = 0;i < wl,j < sl;)
		{
			if (s.charAt(j) != w.charAt(i))
			{
				i++;
				continue;
			}
			if (s.charAt(j) == w.charAt(i))
			{
				p = i;
				j++;
				i++;

			}
		}
		p = p - sl + 1;
		if (j == sl)
		{
			System.out.printf("%d",p);
		}
	}
}

