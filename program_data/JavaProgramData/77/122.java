package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		char a;
		char b;
		int slen;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		slen = s.length();
		a = s.charAt(0);
		for (i = 0;i < slen;i++)
		{
			if (s.charAt(i) != s.charAt(0))
			{
				b = s.charAt(i);
				break;
			}
		}
		for (i = 0;i < slen;i++)
		{
			if (s.charAt(i) == b)
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (s.charAt(j) == a)
					{
						System.out.printf("%d %d\n",j,i);
						s = s.substring(0, j);
						break;
					}
				}
			}
		}
		return 0;
	}
}

