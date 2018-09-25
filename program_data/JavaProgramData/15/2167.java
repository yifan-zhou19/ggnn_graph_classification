package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len0;
		int wid0;
		int len1;
		int wid1;
		int[][] a = new int[100][100];
		int i;
		int j;
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
					*(a + i) + j = tempVar2;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0 && a[i + 1][j] == 0 && a[i][j + 1] == 0)
				{
					len0 = i;
					wid0 = j;
				}
				if (a[i][j] == 0 && a[i - 1][j] == 0 && a[i][j - 1] == 0)
				{
					len1 = i;
					wid1 = j;
				}
			}
		}
		System.out.printf("%d\n",Math.abs((len1 - len0 - 1) * (wid1 - wid0 - 1)));
		return 0;
	}
}

