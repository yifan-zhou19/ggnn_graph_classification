package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] w = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int j;
		int ls;
		int lw;
		int d;
		int p = 0;
		int q = 1;
		String ps;
		String pw;
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
		ps = s[0];
		pw = w[0];
		ls = s.length();
		lw = w.length();
		for (i = 0;i < lw;i++)
		{
			if (*(pw.Substring(i)) == ps)
			{
				for (j = 0;j < ls;j++)
				{
					if (*(pw.Substring(i) + j) == *(ps.Substring(j)))
					{
						p = 1;
						continue;
					}
					else
					{
						p = 0;
						break;
					}
				}
				if (p != 0)
				{
					if (q != 0)
					{
						d = i;
						q = 0;
					}
				}
			}
			else
			{
				continue;
			}
		}
		System.out.printf("%d\n",d);
	}
}

