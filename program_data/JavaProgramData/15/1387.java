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
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 1;j < n;j++)
			{
			if (a[i][j - 1] == 0 && a[i - 1][j] == 0)
			{
			break;
			}
			}
		if (a[i][j - 1] == 0 && a[i - 1][j] == 0)
		{
		break;
		}
		}
		for (k = 0;k < n;k++)
		{
			for (l = 0;l < n;l++)
			{
			if (a[k][l + 1] == 255 && a[k + 1][l] == 255 && a[k][l] == 0)
			{
			break;
			}
			}
		if (a[k][l + 1] == 255 && a[k + 1][l] == 255 && a[k][l] == 0)
		{
		break;
		}
		}
		System.out.printf("%d",(k - i) * (l - j));
	}


}

