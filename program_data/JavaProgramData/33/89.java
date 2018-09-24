package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[1000][256];
		char[][] b = new char[1000][256];
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
			j = 0;
			c = String.valueOf(a[i]).length();
			for (j = 0;j < c;j++)
			{
				if (a[i][j] == 'A')
				{
					b[i][j] = 'T';
				}
				if (a[i][j] == 'T')
				{
					b[i][j] = 'A';
				}
				if (a[i][j] == 'G')
				{
					b[i][j] = 'C';
				}
				if (a[i][j] == 'C')
				{
					b[i][j] = 'G';
				}
				System.out.printf("%c",b[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}


}

