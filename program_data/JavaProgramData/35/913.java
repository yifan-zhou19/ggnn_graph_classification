package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int an = 0;
		int m;
		int n;
		int p;
		int q;
		int flag = 0;
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
		i = 0;
	//	for(i=0;i<m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > an)
				{
					an = a[i][j];
					p = i;
					q = j;
				}
			}

			for (i = 0;i < m;i++)
			{
				if (a[i][q] < an)
				{
					flag = 0;
					break;
				}
				else
				{
					flag = 1;
				}
			}
		//	if(flag)break;
		}
		if (flag != 0)
		{
			System.out.printf("%d+%d",p,q);
		}
		else
		{
			System.out.print("No");
		}
	}
}

