package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[60]);
		String w = new String(new char[60]);
		int i;
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
		int lens = s.length();
		int lenw = w.length();
		for (i = 0;i <= lenw - 1;i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
			if (w.charAt(i + 1) == s.charAt(1))
			{
				if (w.charAt(i + lenw - 1) == s.charAt(lenw - 1))
				{
					System.out.printf("%d\n",i);
					break;
				}
				1;
			}
			1;
			}
			1;
		}
		return 0;

	}
}

