package <missing>;

public class GlobalMembers
{
	///#include <malloc.h>
	public static int Main()
	{
		int[][] a = new int[100][100];
		int m;
		int n;
		int i;
		int j;
		int k;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		while (k > 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			sum = sum + a[0][j] + a[m - 1][j];
		}
		for (i = 1;i < m - 1;i++)
		{
			sum = sum + a[i][0] + a[i][n - 1];
		}
		System.out.printf("%d\n",sum);
		sum = 0;
		k--;
		}
		return 0;
	}

}

