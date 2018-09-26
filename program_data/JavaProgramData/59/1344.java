package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int n;
		int m;
		int t;
		int z = 0;
		char[][] old = new char[200][200];
		char[][] newa = new char[200][200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				old[i] = tempVar2.charAt(0);
			}
			newa[i] = old[i];
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (t = 0; t < m - 1; t++)
		{
			for (i = 0; i < n; i++)
			{
				for (a = 0; a < n; a++)
				{
					if (old[i][a] == '@')
					{
						if (old[i + 1][a] == '.')
						{
							newa[i + 1][a] = '@';
						}
						if (old[i - 1][a] == '.')
						{
							newa[i - 1][a] = '@';
						}
						if (old[i][a + 1] == '.')
						{
							newa[i][a + 1] = '@';
						}
						if (old[i][a - 1] == '.')
						{
							newa[i][a - 1] = '@';
						}
					}
				}
			}
			for (i = 0; i < n; i++)
			{
				old[i] = newa[i];
			}
		}
		for (i = 0; i < n; i++)
		{
			for (a = 0; a < n; a++)
			{
				if (newa[i][a] == '@')
				{
					z++;
				}
			}
		}
		System.out.printf("%d", z);
		return 0;
	}

}

