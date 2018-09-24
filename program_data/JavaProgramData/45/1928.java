package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int j;
		int p;
		int sLen;
		int wLen;
		int test = 0;
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
		sLen = s.length();
		wLen = w.length();

		for (j = 0;j < wLen;j++)
		{
			p = j;
			if (s.charAt(0) == w.charAt(j))
			{
				for (i = 1;i < sLen;i++,p++)
				{
					if (s.charAt(i) != w.charAt(p + 1))
					{
						break;
					}
					if (i == sLen - 1)
					{
						System.out.printf("%d\n",j);
						test = 1;
						break;
					}
				}
			}
			if (test == 1)
			{
				break;
			}

		}
		return 0;
	}
}

