package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int m;
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0;2 * k < m && 2 * k < n;k++)
		{
			for (i = k,j = k;j < n - k - 1;j++)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			for (;i < m - k - 1;i++)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			if (i == k || j == k)
			{
				System.out.printf("%d\n",a[i][j]);
				break;
			}
			for (;j > k;j--)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			for (;i > k;i--)
			{
				System.out.printf("%d\n",a[i][j]);
			}
		}
		return 0;
	}
}

