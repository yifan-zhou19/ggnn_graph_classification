package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[][] a = new int[100][100];
		int m;
		int n;
		int[] b = new int[10000];
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
		for (i = 0;i < n;i++)
		{
			j = 0;
			k = i;
			while (k != -1 && j < m)
			{
				System.out.printf("%d\n",a[j][k]);
				j++;
				k--;
			}
		}
		for (i = 1;i < m;i++)
		{
			j = n - 1;
			k = i;
			while (k < m && a[k][j] != 0)
			{
				System.out.printf("%d\n",a[k][j]);
				k++;
				j--;
			}
		}
		return 0;
	}
}

