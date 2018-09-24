package <missing>;

public class GlobalMembers
{
	public static int[][] t = new int[10][10];
	public static int a;
	public static int b;
	public static int andian(int x,int y)
	{
		int i;
		int j = 0;
		for (i = 0;i <= b - 1;i++)
		{
		if (t[x][y] < t[x][i])
		{
			j++;
		}
		}
		for (i = 0;i <= a - 1;i++)
		{
		if (t[x][y] > t[i][y])
		{
			j++;
		}
		}
		if (j == 0)
		{
			System.out.printf("%d+%d",x,y);
		return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int c;
		int d = 0;
		int r;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= a - 1;i++)
		{
			for (j = 0;j <= b - 1;j++)
			{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t[i][j] = Integer.parseInt(tempVar3);
		}
			}
		}
		for (i = 0;i <= a - 1;i++)
		{
			for (j = 0;j <= b - 1;j++)
			{
			d = andian(i, j) + d;
			}
		}
		if (d == 0)
		{
			System.out.print("No");
		}

	}
}

