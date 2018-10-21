package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int max;
		int flag = 0;
		int s;
		int[][] a = new int[10][10];
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
			max = 0;
			for (j = 1;j < n;j++)
			{
				if (a[i][j] > a[i][max])
				{
					max = j;
				}
			}
				s = 1;
			for (j = 0;j < m;j++)
			{
				if (a[j][max] < a[i][max])
				{
					s = 0;
					break;
				}
			}
			if (s == 1)
			{
				System.out.printf("%d+%d\n",i,max);
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

