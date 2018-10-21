package <missing>;

public class GlobalMembers
{
	public static int[][] array = new int[5][5];
	public static int scan(int N, int M)
	{
		int i;
		int[] temp = new int[5];
		if ((N >= 0) && (N < 5) && (M >= 0) && (M < 5))
		{
			for (i = 0;i < 5;i++)
			{
				temp[i] = array[N][i];
				array[N][i] = array[M][i];
				array[M][i] = temp[i];
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
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
		if (scan(n, m) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d",array[i][j]);
					if (j != 4)
					{
						System.out.print(" ");
					}
				}
				if (i != 4)
				{
					System.out.print("\n");
				}
			}
		}
		else if (scan(n, m) == 0)
		{
			System.out.print("error\n");
		}
	}
}

