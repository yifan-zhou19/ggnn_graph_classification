package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] jianji = new char[n][260];
		char[][] hubu = new char[n][260];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				jianji[i] = tempVar2.charAt(0);
			}
			int len = String.valueOf(jianji[i]).length();
			for (int k = 0;k < len;k++)
			{
				if (jianji[i][k] == 'A')
				{
					hubu[i][k] = 'T';
				}
				else if (jianji[i][k] == 'T')
				{
					hubu[i][k] = 'A';
				}
				else if (jianji[i][k] == 'C')
				{
					hubu[i][k] = 'G';
				}
				else if (jianji[i][k] == 'G')
				{
					hubu[i][k] = 'C';
				}
			}
			for (int k = len;k < n;k++)
			{
				hubu[i][k] = '\0';
			}
		}
		for (int i = 0;i < n - 1;i++)
		{
			System.out.printf("%s\n",hubu[i]);
		}
		System.out.printf("%s",hubu[n - 1]);
		return 0;
	}


}

