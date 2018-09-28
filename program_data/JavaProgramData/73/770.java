package <missing>;

public class GlobalMembers
{
	public static int rowmax(int[] a)
	{
		int t = a[0];
		for (int i = 1;i < 5;i++)
		{
			if (t < a[i])
			{
			   t = a[i];
			}
		}
		return t;
	}
	public static int linemin(int a1,int a2,int a3,int a4,int a5)
	{
		if (a1 > a2)
		{
			a1 = a2;
		}
		if (a1 > a3)
		{
			a1 = a3;
		}
		if (a1 > a4)
		{
		   a1 = a4;
		}
		if (a1 > a5)
		{
		   a1 = a5;
		}
		return a1;
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int count = 0;
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				if (a[i][j] == rowmax(a[i]) && a[i][j] == linemin(a[0][j], a[1][j], a[2][j], a[3][j], a[4][j]))
				{
					System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
					count++;
				}
			}
		}
		if (count == 0)
		{
		   System.out.print("not found\n");
		}
	}

}

