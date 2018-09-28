package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int m; //m,n?????????
		int n;
		int i;
		int i1;
		int j;
		int maxi;
		int maxj;
		int flag = 1;
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
		for (i = 0;i < m;i++)
		{
			flag = 1;
			for (j = 0;j < n;j++)
			{
				if (a[i][j] >= a[i][0])
				{
					maxi = i;
					maxj = j;
				}
			}
			for (i1 = 0;i1 < m;i1++)
			{
				if (a[i1][maxj] < a[maxi][maxj])
				{
					flag *= 0;
				}
				else
				{
					flag *= 1;
				}
			}
			if (flag == 1)
			{
				System.out.printf("%d+%d\n",maxi,maxj);
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}


}

