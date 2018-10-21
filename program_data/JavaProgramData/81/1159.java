package <missing>;

public class GlobalMembers
{
	public static int[] b = {0, 1, 2, 3, 4};
	public static int[][] a = new int[5][5];
	public static int x;
	public static int y;
	public static int i;
	public static int j;
	public static int Main()
	{
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		b[x] = y;
		b[y] = x;
		if (x < 0 || x>4 || y < 0 || y>4)
		{
			System.out.print("error\n");
			return 0;
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",a[b[i]][j]);
			}
			System.out.printf("%d\n",a[b[i]][j]);
		}
		return 0;
	}
}

