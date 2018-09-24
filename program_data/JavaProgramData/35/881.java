package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] a = new int[8][8];
		int m1;
		int n1;
		int max;
		int i;
		int j;
		int k;
		int num;
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
			max = a[i][0];
			m1 = i;
			n1 = 0;
			for (j = 0;j < n - 1;j++)
			{
				if (a[i][j] < a[i][j + 1])
				{
					m1 = i;
					n1 = j + 1;
					max = a[i][j + 1];
				}
			}
			num = 0;
			for (i = 0;i < m;i++)
			{

				j = n1;
				if (a[i][j] < max)
				{
					break;
				}
				else
				{
					num = num + 1;
				}

			}
			if (num == m)
			{
				break;
			}
		}
		if (num == m)
		{
			System.out.printf("%d+%d\n",m1,n1);
		}
		else
		{
			System.out.print("No\n");
		}
	}

}

