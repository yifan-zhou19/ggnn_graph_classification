package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
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
			l = String.valueOf(a[i]).length();
			for (j = 0;j < l;j++)
			{
				if (a[i][j] == 'G')
				{
					b[i][j] = 'C';
				}
				if (a[i][j] == 'C')
				{
					b[i][j] = 'G';
				}
				if (a[i][j] == 'A')
				{
					b[i][j] = 'T';
				}
				if (a[i][j] == 'T')
				{
					b[i][j] = 'A';
				}
			}
			b[i][l] = 0;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",b[i]);
		}
		return 0;
	}
}

