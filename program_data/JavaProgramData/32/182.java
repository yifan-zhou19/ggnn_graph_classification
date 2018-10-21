package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String p = new String(new char[100]);
			String q = new String(new char[100]);
			int j;
			int lp;
			int lq;
			int l;
			int[] a = new int[100];
			int[] b = new int[100];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q = tempVar3.charAt(0);
			}
			lp = p.length();
			lq = q.length();
			l = lp - lq;
			for (j = 0;j < lp;j++)
			{
				if (p.charAt(j) <= '9' && p.charAt(j) >= 0)
				{
					a[j] = p.charAt(j) - 48;
				}
			}

			for (j = 0;j < lq;j++)
			{
				if (q.charAt(j) <= '9' && q.charAt(j) >= 0)
				{
					b[j] = q.charAt(j) - 48;
				}
			}

			for (j = lq - 1;j >= 0;j--)
			{
				int c;
				c = a[j + l] - b[j];
				if (c >= 0)
				{
					a[j + l] = c;
				}
				else
				{
					a[j + l] = 10 + c;
					a[j + l - 1] = a[j + l - 1] - 1;
				}
			}

			for (j = 0;j < lp;j++)
			{
				p = tangible.StringFunctions.changeCharacter(p, j, a[j] + 48);
			}

			System.out.printf("%s\n",p);
		}


	return 0;
	}
}

