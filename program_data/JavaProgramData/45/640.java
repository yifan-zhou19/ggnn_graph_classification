package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int slen;
		int wlen;
		int total;
		int i;
		int j;
		int k;
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
		slen = s.length();
		wlen = w.length();
		for (i = 0;i <= wlen - slen;i++)
		{
			if (s.charAt(0) == w.charAt(i))
			{
				total = 0;
				for (j = i,k = 0;j <= slen + i - 1;j++,k++)
				{
					if (s.charAt(k) == w.charAt(j))
					{
						total++;
					}
				}
				if (total == slen)
				{
					System.out.printf("%d",i);
					break;
				}
			}
		}
	}








}

