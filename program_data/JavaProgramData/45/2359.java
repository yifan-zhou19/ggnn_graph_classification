package <missing>;

public class GlobalMembers
{
	public static int dingwei(String s, String w)
	{
		int len;
		int i;
		int j;
		len = s.length();
		for (i = 0;;i++)
		{
			for (j = 0;j < len && s[j].equals(w[i + j]);j++)
			{
				;
			}
			if (j == len)
			{
				return i;
			}
		}
	}
	public static int Main()
	{
		final String c1 = "";
		final String c2 = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c2 = tempVar2.charAt(0);
		}
		System.out.printf("%d\n",dingwei(c1, c2));
		return 0;
	}
}

