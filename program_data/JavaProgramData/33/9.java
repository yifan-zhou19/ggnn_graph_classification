package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int l;
		int j;
		char[][] a = new char[1000][300];
		char[][] b = new char[1000][300];
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
			l = String.valueOf(a[i]).length();
			for (j = 0;j < l;j++)
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
			for (j = 0;j < l - 1;j++)
			{
				System.out.printf("%c",b[i][j]);
			}
			System.out.printf("%c\n",b[i][l - 1]);
		}
	}




}

