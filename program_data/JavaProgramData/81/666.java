package <missing>;

public class GlobalMembers
{
	public static int judge(int m, int n)
	{
		if ((m < 5) && (n < 5))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] array = new int[5][5];
		int tmp;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					(array[i][j]) = Integer.parseInt(tempVar);
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
		if (judge(m, n) != 0)
		{
			for (i = 0;i < 5;i++)
			{
				tmp = array[m][i];
				array[m][i] = array[n][i];
				array[n][i] = tmp;
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
		return 0;
	}


}

