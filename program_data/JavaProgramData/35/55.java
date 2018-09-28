package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[10][10];
		int m;
		int n;
		int i;
		int j;
		int[] b = new int[10];
		int[] c = new int[10];
		int k = 0;
		int l = 0;
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
				if (a[i][j] > b[i])
				{
					b[i] = a[i][j];
				}
			}
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == b[i])
				{
					c[i] = j;
				}
			}
		}
		for (i = 0;i < m;i++,k = 0)
		{
			for (j = 0;j < m;j++)
			{
				if (b[i] > a[j][c[i]])
				{
					k = 1;
				}
			}
			if (k == 0)
			{
				System.out.printf("%d+%d",i,c[i]);
				break;
			}
			else
			{
				l++;
			}
		}
		if (l == m)
		{
			System.out.print("No");
		}
	}
}

