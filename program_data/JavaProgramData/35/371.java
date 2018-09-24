package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int[][] a = new int[8][8];
		int i;
		int j;
		int b;
		int p;
		int e = 0;
		int f = 0;
		int sum = 0;
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
			sum = 0;
			b = a[i][0];
			e = i;
			f = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > b)
				{
					b = a[i][j];
				e = i;
				f = j;
				}
			}
			for (p = 0;p < m;p++)
			{
				if (a[p][f] < b)
				{
					break;
				}
				else
				{
					sum++;
				}
			}
			if (sum == m)
			{
				System.out.printf("%d+%d",e,f);
				break;
			}
		}
		if (sum != m)
		{
			System.out.print("No");
		}
	}

}

