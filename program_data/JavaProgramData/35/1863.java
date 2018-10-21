package <missing>;

public class GlobalMembers
{
	public static void Main()

	{
		int[][] a = new int[8][8];
		int m;
		int n;
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
		int i;
		int j;
		int[] tag = new int[8];
		int[] temp = new int[8];
		int[] k = new int[8];
		int b = 0;
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
				if (a[i][j] > temp[i])
				{
					temp[i] = a[i][j];
					tag[i] = j;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (a[i][tag[i]] > a[j][tag[i]])
				{
					k[i] = 1;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			if (k[i] == 0)
			{
				b = 1;
				System.out.printf("%d+%d",i,tag[i]);
				break;
			}
		}
			if (b == 0)
			{
				System.out.print("No");
			}
	}
}

