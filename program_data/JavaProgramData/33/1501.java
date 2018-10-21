package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][1000];
		char[][] b = new char[1000][1000];
		int n;
		int i;
		int j;
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
				a[i] = tempVar2.charAt(0);
			}
			for (j = 0;a[i][j] != '\0';j++)
			{
				if (a[i][j] == 'A')
				{
					b[i][j] = 'T';
				}
				if (a[i][j] == 'T')
				{
					b[i][j] = 'A';
				}
				if (a[i][j] == 'C')
				{
					b[i][j] = 'G';
				}
				if (a[i][j] == 'G')
				{
					b[i][j] = 'C';
				}
			}
			System.out.printf("%s\n",b[i]);
		}
		return 0;
	}


}

