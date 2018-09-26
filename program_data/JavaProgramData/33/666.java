package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int b;
		int x;
		int y;
		char[][] a = new char[10000][300];
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
			b = String.valueOf(a[i]).length();
			for (j = 0;j < b;j++)
			{
				if (a[i][j] == 'A')
				{
					a[i][j] = 'T';
				}
				else if (a[i][j] == 'T')
				{
					a[i][j] = 'A';
				}
				else if (a[i][j] == 'C')
				{
					a[i][j] = 'G';
				}
				else if (a[i][j] == 'G')
				{
					a[i][j] = 'C';
				}
			}
			System.out.println(a[i]);
		}
		return 0;
	}
}

