package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		String w = new String(new char[1000]);
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
		int sn = s.length();
		int wn = w.length();
		int pos = 0;
		int i;
		for (i = 0;i < wn;i++)
		{
			if (pos == sn - 1)
			{
				break;
			}
			if (w.charAt(i) == s.charAt(pos))
			{
				pos++;
			}
			else
			{
				pos = 0;
			}
		}
		System.out.printf("%d",i - pos);

		return 0;
	}
}

