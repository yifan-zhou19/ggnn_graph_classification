package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int j;
		int m;
		int k;
		int ls;
		int lw;
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
		for (i = 0;i < lw;i++)
		{
			m = i;
			if (s.charAt(0) != w.charAt(i))
			{
				continue;
			}
			for (j = 0;j < ls;j++,i++)
			{
				if (s.charAt(j) != w.charAt(i))
				{
					break;
				}
				k = 1;
			}
			if (k = 1)
			{
				break;
			}
		}
		System.out.printf("%d",m);
	  return 0;
	}



}

