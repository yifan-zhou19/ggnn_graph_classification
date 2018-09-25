package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len = 0;
		int m;
		String w = new String(new char[41]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		m = w.length();
		len = m;
			 System.out.printf("%s",w);
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				w = tempVar3.charAt(0);
			}
			m = w.length();
			len += m + 1;
			if (len > 80)
			{
				System.out.printf("\n%s",w);
				len = m;
			}
			else
			{
				System.out.printf(" %s",w);
			}
		}
		return 0;
	}




}

