package <missing>;

public class GlobalMembers
{
	public static int f(int[][] array, int n, int m)
	{
		if (m > 4 || n > 4)
		{
			return (0);
		}
		else
		{
			return (1);
		}
	}
	public static void Main()
	{
		int[][] array = new int[5][5];
		int i;
		int j;
		int n;
		int m;
		int mid;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					array[i][j] = Integer.parseInt(tempVar);
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
			if (f(array, n, m) != 0)
			{
				for (j = 0;j < 5;j++)
				{
					mid = array[n][j];
					array[n][j] = array[m][j];
					array[m][j] = mid;
				}
				for (i = 0;i < 5;i++)
				{
					for (j = 0;j < 4;j++)
					{
						System.out.printf("%d ",array[i][j]);
					}
					System.out.printf("%d",array[i][4]);
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print("error");
			}
	}





}

