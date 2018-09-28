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
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		int i = 0;
		int j = 0;
		int slen = s.length();
		int wlen = w.length();
		while (i < slen && j < wlen)
		{
			if (s.charAt(i) == w.charAt(j))
			{
				i++,j++;
			}
			else
			{
				j = j - i + 1;
				i = 0;
			}
		}
		if (i >= slen)
		{
			System.out.printf("%d\n",j - i);
		}
	}
}

