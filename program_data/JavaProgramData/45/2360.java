package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
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
		final String oow = "";
		int lens;
		int lenw;
		lens = s.length();
		lenw = w.length();
		for (i = 0;i <= lenw - lens;i++)
		{
			for (k = i;k <= i + lens - 1;k++)
			{
				oow.charAt(i)[k - i] = w.charAt(k);
			}
		}
		for (i = 0;i <= lenw - lens;i++)
		{
			if (strcmp(s,oow.charAt(i)) == 0)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
		return 0;
	}
}

