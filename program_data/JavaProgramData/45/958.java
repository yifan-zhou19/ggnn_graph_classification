package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String w = new String(new char[100]);
		int i;
		int m = 0;
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
		for (;;)
		{
			for (i = n + 1;;i++)
			{
				if (w.charAt(i) == '\0')
				{
					System.out.print("No");
					return 0;
				}
				if (s.charAt(0) == w.charAt(i))
				{
					n = i;
					break;
				}
			}
			for (i++;;i++)
			{
				if (s.charAt(i - n) == '\0')
				{
					m = 1;
					break;
				}
				if (s.charAt(i - n) != w.charAt(i))
				{
					m = 2;
					break;
				}
			}
			if (m == 1)
			{
				System.out.printf("%d",n);
				break;
			}
			else if (w.charAt(i) == '\0')
			{
				System.out.print("No");
				break;
			}
			else
			{
				continue;
			}
		}
		return 0;
	}

}

