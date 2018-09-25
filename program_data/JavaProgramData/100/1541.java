package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int l;
		int c = 0;
		int[] ucount = new int[26];
		int[] lcount = new int[26];
		int cmp = 65;
		String hao = new String(new char[301]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			hao = tempVar.charAt(0);
		}
		l = hao.length();
		for (i = 0;i < 26;i++)
		{
			for (k = 0;k < l;k++)
			{
				if (hao.charAt(k) == cmp + i)
				{
					ucount[i] += 1;
				}
			}
			if (ucount[i] != 0)
			{
			   System.out.printf("%c=%d\n",cmp + i,ucount[i]);
			}
		}
		for (i = 32;i < 58;i++)
		{
			for (k = 0;k < l;k++)
			{
				if (hao.charAt(k) == cmp + i)
				{
					lcount[i - 32] += 1;
				}
			}
			if (lcount[i - 32] != 0)
			{
			  System.out.printf("%c=%d\n",cmp + i,lcount[i - 32]);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (ucount[i] == 0 && lcount[i] == 0)
			{
				c += 1;
			}
		}
		if (c == 26)
		{
			System.out.print("No");
		}
		return 0;
	}
}

