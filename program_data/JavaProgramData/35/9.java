package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l;
		int m;
		int[][] a = new int[N][N];
		int[] max = new int[N];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < l;i++)
		{
			max[i] = 0;
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				if (a[i][j] > a[i][max[i]])
				{
					max[i] = j;
				}
			}
		}
		for (i = 0;i < l;i++)
		{
			for (j = 0;j < l;j++)
			{
				if (a[j][max[i]] < a[i][max[i]])
				{
					break;
				}
			}
			if (j == l)
			{
				System.out.printf("%d+%d\n",i,max[i]);
				l = 0;
				break;
			}
		}
		if (l != 0)
		{
			System.out.print("No\n");
		}
	}
}

