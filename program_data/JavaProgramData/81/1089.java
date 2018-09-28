package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int m;
	public static int n;
	public static int f(int x,int y)
	{
		int[] temp = new int[5];
		int i;
		if (x > 4 || y > 4)
		{
			return 0;
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
			temp[i] = a[x][i];
			a[x][i] = a[y][i];
			a[y][i] = temp[i];
			}
		return 1;
		}
	}
	public static void Main()
	{
		int i;
		int j;
		int t;
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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		t = f(m, n);
		if (t == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 5;j++)
			{
				System.out.printf("%d%c",a[i][j],j == 4?'\n':' ');
			}
			}
		}
	}
}

