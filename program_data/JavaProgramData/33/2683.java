package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] an = new char[1000][256];
		int n;
		int i;
		int j;
		int[] bn = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				an[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			bn[i] = String.valueOf(an[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < bn[i];j++)
			{
				if (an[i][j] == 'A')
				{
					an[i][j] = 'T';
					continue;
				}
				if (an[i][j] == 'T')
				{
					an[i][j] = 'A';
					continue;
				}
				if (an[i][j] == 'C')
				{
					an[i][j] = 'G';
					continue;
				}
				if (an[i][j] == 'G')
				{
					an[i][j] = 'C';
					continue;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",an[i]);
		}
		return 0;
	}
}

