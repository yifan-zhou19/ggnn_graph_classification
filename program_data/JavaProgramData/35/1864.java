package <missing>;

public class GlobalMembers
{
	public static int maxh(int[][] x, int h, int l)
	{
		int i;
		int k = 0;
		for (i = 1;i < l;i++)
		{
						if (x[h][i] > x[h][k])
						{
							k = i;
						}
		}
		return x[h][k];
	}
	public static int minl(int[][] x, int h, int l)
	{
		int i;
		int k = 0;
		for (i = 1;i < h;i++)
		{
						if (x[i][l] < x[k][l])
						{
							k = i;
						}
		}
		return x[k][l];
	}
	public static int Main()
	{
		int h;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		int[][] x = new int[8][8];
		int i;
		int j;
		int a;
		int b;
		int tip = 0;
		for (i = 0;i < h;i++)
		{
						for (j = 0;j < l;j++)
						{
							String tempVar3 = ConsoleInput.scanfRead();
							if (tempVar3 != null)
							{
								x[i][j] = Integer.parseInt(tempVar3);
							}
						}
		}
		for (i = 0;i < h;i++)
		{
						for (j = 0;j < l;j++)
						{
										if (x[i][j] == minl(x, h, j) && x[i][j] == maxh(x, i, l))
										{
											a = i;
											b = j;
											tip = 1;
										}
						}
		}
		if (tip == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d+%d",a,b);
		}
	}

}

