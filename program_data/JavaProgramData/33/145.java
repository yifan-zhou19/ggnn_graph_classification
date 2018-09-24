package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int n;
		char[][] a = new char[1000][5000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}

		for (i = 0;i <= n - 1;i++)
		{
			j = 0;
			while (a[i][j] != '\0')
			{
				if (a[i][j] == 'A')
				{
					a[i][j] = 'T';
					j++;
				}
				if (a[i][j] == 'T')
				{
					a[i][j] = 'A';
					j++;
				}
				if (a[i][j] == 'C')
				{
					a[i][j] = 'G';
					j++;
				}
				if (a[i][j] == 'G')
				{
					a[i][j] = 'C';
					j++;
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
		return 0;
	}


}

