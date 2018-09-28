package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] array = new int[5][5];
		int[] p = new int[5];
		int i;
		int j;
		int m;
		int n;
		int[] num = new int[5];
		p = array;
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
		if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
		{
			for (i = 0;i < 5;i++)
			{
				num[i] = array[m][i];
				array[m][i] = array[n][i];
				array[n][i] = num[i];
			}

		for (i = 0;i < 5;i++)
		{
			System.out.printf("%d %d %d %d %d\n",array[i][0],array[i][1],array[i][2],array[i][3],array[i][4]);
		}
		}
		else
		{
			System.out.print("error");
		}



	}
}

