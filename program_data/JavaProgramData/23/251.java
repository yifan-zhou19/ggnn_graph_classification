package <missing>;

public class GlobalMembers
{
	// ????.cpp : ??????????????
	//



	public static int Main()
	{
		char[][] a = new char[100][100];
		int[] l = new int[100];
		int i = 0;
		int j;
		int k;
		int p;
		for (i = 0;i <= 100;++i)
		{
			for (j = 0;j <= 100;++j)
			{
				String tempVar = ConsoleInput.scanfRead(null, 1);
				if (tempVar != null)
				{
					a[i][j] = tempVar.charAt(0);
				}
				if (a[i][j] == ' ' || a[i][j] == '\n')
				{
					break;
				}
			}
			if (a[i][j] == ' ')
			{
				a[i][j] = '\0';
			}
			if (a[i][j] == '\n')
			{
				a[i][j] = '\0';
				break;
			}
		}
		System.out.printf("%s",a[i]);
		for (k = i - 1;k >= 0;--k)
		{
			System.out.printf(" %s",a[k]);
		}
		return 0;
	}

}

