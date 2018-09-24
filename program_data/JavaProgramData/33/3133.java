package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		char[][] a = new char[1000][256];
		char[][] b = new char[1000][256];
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
		}
		for (i = 0;i < n;i++)
		{
			k = String.valueOf(a[i]).length();
			for (j = 0;j < k;j++)
			{
				if (a[i][j] == 'A')
				{
					b[i][j] = 'T';
				}
				else
				{
					if (a[i][j] == 'T')
					{
						b[i][j] = 'A';
					}
					else
					{
						if (a[i][j] == 'C')
						{
							b[i][j] = 'G';
						}
						else
						{
							b[i][j] = 'C';
						}
					}
				}
			}
			b[i][k] = '\0';
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",b[i]);
		}
		return 0;
	}

}

