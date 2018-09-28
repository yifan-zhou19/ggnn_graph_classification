package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[10000][255];
		char[][] b = new char[10000][255];
		int i;
		int n;
		int j;
		int len;
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
			len = String.valueOf(a[i]).length();
			for (j = 0;j < len;j++)
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
			}
			System.out.printf("%s\n",b[i]);
		}
		return 0;
	}
}

