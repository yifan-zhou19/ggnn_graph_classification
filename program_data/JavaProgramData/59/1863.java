package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int q;
		int p;
		int n;
		int m;
		int i;
		int s;
		char[][] a = new char[200][200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (q = 0;q < n;q++)
		{
			for (p = 1;p < n + 2;p++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					a[q][p] = tempVar2.charAt(0);
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < m;i++)
		{
			for (q = 0;q < n;q++)
			{
				for (p = 1;p < n + 2;p++)
				{
					if (a[q][p] == '@')
					{
						if (a[q - 1][p] == '.')
						{
							a[q - 1][p] = '*';
						}
						if (a[q + 1][p] == '.')
						{
							a[q + 1][p] = '*';
						}
						if (a[q][p - 1] == '.')
						{
							a[q][p - 1] = '*';
						}
						if (a[q][p + 1] == '.')
						{
							a[q][p + 1] = '*';
						}
					}
				}
			}
			for (q = 0;q < n;q++)
			{
				for (p = 1;p < n + 2;p++)
				{
				   if (a[q][p] == '*')
				   {
					   a[q][p] = '@';
				   }
				}
			}
		}
		s = 0;
		for (q = 0;q < n;q++)
		{
			for (p = 1;p < n + 2;p++)
			{
				if (a[q][p] == '@')
				{
				   s = s + 1;
				}
			}
		}
		System.out.printf("%d",s);
		return 0;
	}











}

