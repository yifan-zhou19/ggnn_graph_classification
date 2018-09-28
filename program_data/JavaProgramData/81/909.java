package <missing>;

public class GlobalMembers
{
	public static int right(int m,int n)
	{
		if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}


	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] array = new int[5][5];
		int[] tempt = new int[5];

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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}


		if (right(m, n) != 0)
		{
			for (i = 0;i < 5;i++)
			{
				tempt[i] = array[m][i];
			}
			for (i = 0;i < 5;i++)
			{
				array[m][i] = array[n][i];
			}
			for (i = 0;i < 5;i++)
			{
				array[n][i] = tempt[i];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",array[i][j]);
				}
				System.out.printf("%d\n",array[i][4]);
			}
		}
		else
		{
			System.out.print("error");
		}
	}
}

