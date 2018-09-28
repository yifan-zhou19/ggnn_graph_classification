package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] a = new int[9][9];
		int i;
		int j;
		int k;
		int l;
		int judge;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(", ");
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
			k = a[i][0];
			l = 0;
			judge = 1;
			for (j = 0;j < n - 1;j++)
			{
				if (a[i][j] < a[i][j + 1])
				{
					k = a[i][j + 1];
					l = j + 1;
				}
			}
			for (j = 0;j < m;j++)
			{
				if (a[j][l] < a[i][l])
				{
					judge = 0;
					break;
				}
			}
			if (judge == 1)
			{
				System.out.printf("%d+%d",i,l);
				break;
			}
		}
		if (judge == 0)
		{
			System.out.print("No");
		}
	}
}

