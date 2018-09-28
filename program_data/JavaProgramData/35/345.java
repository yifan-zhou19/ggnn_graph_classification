package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int i;
		int j;
		int t;
		int s;
		int k = 0;
		int[][] a = new int[9][9];
		int max = 0;
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
			for (j = 0;j < n;j++)
			{
				if (a[i][j] >= max)
				{
					max = a[i][j];
					s = i;
					t = j;
				}
			}

			for (i = 0;i < m;i++,i != s)
			{
				if (a[i][t] > max)
				{
				System.out.printf("%d+%d",s,t);
				k = 1;
				break;
				}
			}
		}
			if (k != 1)
			{
				System.out.print("No");
			}

	}

}

