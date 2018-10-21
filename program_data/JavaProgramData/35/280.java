package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][10];
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
		int b;

		int[] c = new int[10];
		int[] d = new int[10];
		for (i = 0;i < m;i++)
		{
			b = -10000;
			for (j = 0;j < n;j++)
			{

				if (a[i][j] > b)
				{
					c[i] = a[i][j];
					b = a[i][j];

				}
			}
		}


		for (j = 0;j < n;j++)
		{
			b = 100000;
			for (i = 0;i < m;i++)
			{

				if (a[i][j] < b)
				{
					b = a[i][j];
					d[j] = a[i][j];
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == c[i] && a[i][j] == d[j])
				{
					System.out.printf("%d+%d",i,j);
					return 0;
				}
			}
		}
		System.out.print("No");

		return 0;
	}

}

