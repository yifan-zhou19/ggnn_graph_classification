package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] DNA = new char[chain][MAX];
		int i;
		int j;
		int n;
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
				DNA[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;DNA[i][j];j++)
			{
				if (DNA[i][j] == 'A')
				{
					DNA[i][j] = 'T';
				}
				else if (DNA[i][j] == 'T')
				{
					DNA[i][j] = 'A';
				}
				else if (DNA[i][j] == 'C')
				{
					DNA[i][j] = 'G';
				}
				else
				{
					DNA[i][j] = 'C';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",DNA[i]);
		}
		return 0;
	}
}

