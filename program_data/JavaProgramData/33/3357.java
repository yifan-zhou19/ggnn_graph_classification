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
		char[][] jjl = new char[n][260];
		char[][] hbl = new char[n][260];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				jjl[i] = tempVar2.charAt(0);
			}
		}
		int len;
		int a;
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(jjl[i]).length();
			for (a = 0;a < len;a++)
			{
				if (jjl[i][a] == 'A')
				{
					hbl[i][a] = 'T';
				}
				if (jjl[i][a] == 'T')
				{
					hbl[i][a] = 'A';
				}
				if (jjl[i][a] == 'C')
				{
					hbl[i][a] = 'G';
				}
				if (jjl[i][a] == 'G')
				{
					hbl[i][a] = 'C';
				}
			}
			hbl[i][len] = '\0';
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%s\n",hbl[i]);
		}
		System.out.printf("%s",hbl[i]);
		return 0;
	}


}

