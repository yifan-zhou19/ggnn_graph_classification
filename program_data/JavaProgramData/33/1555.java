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
		char[][] jjd = new char[n][256];
		char[][] pjjd = new char[n][256];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				jjd[i] = tempVar2.charAt(0);
			}
			for (int k = 0;k < 256;k++)
			{
				if (jjd[i][k] == 'A')
				{
					pjjd[i][k] = 'T';
				}
				if (jjd[i][k] == 'C')
				{
					pjjd[i][k] = 'G';
				}
				if (jjd[i][k] == 'G')
				{
					pjjd[i][k] = 'C';
				}
				if (jjd[i][k] == 'T')
				{
					pjjd[i][k] = 'A';
				}
				if (jjd[i][k] == 0)
				{
					break;
				}

			}
		System.out.printf("%s\n",pjjd[i]);
		}
		return 0;
	}
}

