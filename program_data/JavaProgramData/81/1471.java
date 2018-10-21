package <missing>;

public class GlobalMembers
{
	public static int change(int[][] a, int x, int y)
	{
		int k;
		int temp;
		if (x >= 0 && x < 5 && y >= 0 && y < 5)
		{
			for (k = 0;k < 5;k++)
			{
				temp = a[x][k];
				a[x][k] = a[y][k];
				a[y][k] = temp;
			}
		return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main(String[] args)
	{
		int n;
		int m;
		int[][] a = new int[5][5];
		int i;
		int j;

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
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}



		if (change(a, n, m) == 1)
		{
			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 5;j++)
			{
				if (j != 4)
				{
					System.out.printf("%d ",a[i][j]);
				}
				else
				{
					System.out.printf("%d",a[i][j]); //??????????
				}
			}
			System.out.print("\n"); //????
			}
		}
		else
		{
			System.out.print("error\n");
		}

	}




}

