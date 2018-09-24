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
		String mulian = new String(new char[257]);
		char[][] zilian = new char[1000][257];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				mulian = tempVar2.charAt(0);
			}
			for (j = 0;mulian.charAt(j) != '\0';j++)
			{
				if (mulian.charAt(j) == 'A')
				{
					zilian[i][j] = 'T';
				}
				else if (mulian.charAt(j) == 'T')
				{
					zilian[i][j] = 'A';
				}
				else if (mulian.charAt(j) == 'G')
				{
					zilian[i][j] = 'C';
				}
				else
				{
					zilian[i][j] = 'G';
				}
			}
			zilian[i][j] = '\0';
		}
		int k;
		for (k = 0;k < n;k++)
		{
			System.out.printf("%s\n",zilian[k]);
		}

		return 0;
	}

}

