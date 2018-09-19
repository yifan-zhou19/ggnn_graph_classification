package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int area = 0;
		int[][] a = new int[num][num];
		int[] x = new int[2];
		int[] y = new int[2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if ((j + 1) % n == 0)
				{
					System.out.print("\n");
				}
			}
		}
		int flag = 0;
		for (i = 0;i < n && flag == 0;i++)
		{
			for (j = 0;j < n && flag == 0;j++)
			{
				if (a[i][j] == 0)
				{
					x[0] = i;
					x[1] = j;
					flag = 1;
					break;
				}
			}
		}
		for (i = n - 1;i >= 0 && flag == 1;i--)
		{
			for (j = n - 1;j >= 0 && flag == 1;j--)
			{
				if (a[i][j] == 0)
				{
					y[0] = i;
					y[1] = j;
					flag = 0;
					break;
				}
			}
		}
		area = area + (y[1] - x[1] - 1) * (y[0] - x[0] - 1);
		System.out.printf("%d",area);
	}
}

