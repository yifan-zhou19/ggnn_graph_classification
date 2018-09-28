package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
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
			for (j = 0;j < String.valueOf(a[i]).length() + 1;j++)
			{
				if (a[i][j] == 'A')
				{
					b[i][j] = 'T';
					continue;
				}
				if (a[i][j] == 'T')
				{
					b[i][j] = 'A';
					continue;
				}
				if (a[i][j] == 'C')
				{
					b[i][j] = 'G';
					continue;
				}
				if (a[i][j] == 'G')
				{
					b[i][j] = 'C';
					continue;
				}
				if (a[i][j] == '\0')
				{
					b[i][j] = '\0';
					break;
				}
			}
			System.out.printf("%s",b[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

