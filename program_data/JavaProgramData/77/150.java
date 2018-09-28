package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = tempVar.charAt(0);
		}
		int n;
		n = String.valueOf(a[0]).length();
		int[][] b = new int[100][100];
		int i;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
			b[0][i] = i;
		}
		for (i = 0;i <= n / 2 - 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] != a[i][j + 1])
				{
					System.out.printf("%d %d\n",b[i][j],b[i][j + 1]);
					for (k = 0;k < j;k++)
					{
						a[i + 1][k] = a[i][k];
						b[i + 1][k] = b[i][k];
					}
					for (k = j + 2;k < n;k++)
					{
						a[i + 1][k - 2] = a[i][k];
						b[i + 1][k - 2] = b[i][k];
					}
				   break;
				}
			}
		}
		//scanf("%d",i);
		return 0;
	}
}

