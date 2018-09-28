package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[10000][500];
		int i;
		int n;
		int j;
		int[] m = new int[10000];
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
			m[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m[i];j++)
			{
				if (a[i][j] == 'A')
				{
					a[i][j] = 'T';
				}
				else
				{
					if (a[i][j] == 'T')
					{
						a[i][j] = 'A';
					}
					else
					{
						if (a[i][j] == 'C')
						{
							a[i][j] = 'G';
						}
						else
						{
							if (a[i][j] == 'G')
							{
								a[i][j] = 'C';
							}
						}
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
		return 0;
	}


}

