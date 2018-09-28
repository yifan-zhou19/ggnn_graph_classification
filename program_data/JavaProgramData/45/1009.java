package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[51]);
		String b = new String(new char[51]);
		int i;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 0;;i++)
		{
			if (b.charAt(i) == '\0' || a.charAt(m) == '\0')
			{
				break;
			}
			if (a.charAt(m) != b.charAt(i))
			{
				m = 0;
				continue;
			}
			m++;
		}
		System.out.printf("%d",i - m);
		return 0;
	}


}

