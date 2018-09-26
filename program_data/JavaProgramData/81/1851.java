package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[10][10];
	public static int Main()
	{
		int process = new int(int y,int z);
		int i;
		int j;
		int n;
		int m;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (process(m, n) != 0)
		{
			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 5;j++)
			{
				System.out.printf("%d",a[i][j]);
				if (j != 4)
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
			}
		}
		else
		{
			System.out.print("error\n");
		}
		return 0;
	}
	public static int process(int y,int z)
	{
		int k;
		int temp;
		if ((y >= 0 && y < 5) && (z >= 0 && z < 5))
		{
			for (k = 0;k < 5;k++)
			{
				temp = a[y][k];
				a[y][k] = a[z][k];
				a[z][k] = temp;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}


}

