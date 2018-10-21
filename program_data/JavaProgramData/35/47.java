package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		int l;
		int k;
		int x;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
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

			for (i = 0,sum = 0;i < m;i++)
			{

				for (j = 1,k = 0;j < n;j++)
				{
					if (a[i][j] > a[i][k])
					{
					k = j;
					}
				}
				for (x = 0,l = 0;x < m;x++)
				{
					if (a[x][k] < a[i][k])
					{
						l = 1;
					}
				}
				if (l == 0)
				{
					System.out.printf("%d+%d\n",i,k);
						sum = 1;
				}
			}
			if (sum == 0)
			{
				System.out.print("No");
			}
	}

}

