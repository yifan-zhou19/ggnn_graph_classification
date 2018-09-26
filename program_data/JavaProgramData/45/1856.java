package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int k;
		int lens;
		int lenw;
		int m = 0;
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
		lens = s.length();
		lenw = w.length();
		for (i = 0;i < lenw;i++)
		{
			for (k = i;k < i + lens;k++)
			{
				if (s.charAt(k - i) != w.charAt(k))
				{
				  m = 1;
				}
			}
			if (m == 0)
			{
				System.out.printf("%d",i);
							break;
			}
			m = 0;

		}
		return 0;
	}


}

