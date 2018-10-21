package <missing>;

public class GlobalMembers
{
		   /*??,????!*/
	public static int Main()
	{
		int[][] a = new int[8][8];
		int m;
		int n;
		int i;
		int j;
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
		int count = 0;
		int p;
		int q;
		int k;
		for (i = 0;i < m;i++)
		{
			p = i;
			q = 0;
			for (j = 1;j < n;j++)
			{
				if (a[p][q] < a[i][j])
				{
					q = j;
				}
			}
			count = 0;
			for (k = 0;k < m;k++)
			{
				if (a[p][q] <= a[k][q])
				{
					count++;
				}
			}
			if (count == m)
			{
				break;
			}
		}
		if (count == m)
		{
			System.out.printf("%d+%d",p,q);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}

}

