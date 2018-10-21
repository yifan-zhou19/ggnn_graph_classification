package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int c;
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		int[] b = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i][j] = Integer.parseInt(tempVar3);
		}
			}
		}
		for (j = 0;j < c;j++)
		{
			i = 0;
		for (k = j;k >= 0 && i < r;k--, i++)
		{
			System.out.printf("%d\n",a[i][k]);
		}
		}
		for (i = 1;i < r;i++)
		{
			j = c - 1;
		for (k = i;k < r && j >= 0;k++, j--)
		{
			System.out.printf("%d\n",a[k][j]);
		}
		}
		return 0;
	}





}

