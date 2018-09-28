package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int c = 0;
		int[][] a = new int[5][5];
		int[][] result = new int[5][5];
		int temp;
		int tempi;
		int tempj;
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
		//??i??????????result[5][5]?
		for (i = 0;i < 5;i++)
		{
			tempj = 0;
			temp = a[i][0];
			for (j = 1;j < 5;j++)
			{
			if (a[i][j] > temp)
			{
				temp = a[i][j];
				tempj = j;
			}
			}
			result[i][tempj] = 1;
		}
		//??j??????
		for (j = 0;j < 5;j++)
		{
			tempi = 0;
			temp = a[0][j];
			for (i = 1;i < 5;i++)
			{
			if (a[i][j] < temp)
			{
				temp = a[i][j];
				tempi = i;
			}
			}
			result[tempi][j]++;
			if (result[tempi][j] == 2)
			{
				System.out.printf("%d %d %d",tempi + 1,j + 1,a[tempi][j]);
			c = 1;
			}
		}
		if (c == 0)
		{
		System.out.print("not found");
		}

	}


}

