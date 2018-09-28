package <missing>;

public class GlobalMembers
{
	public static int[][] shuzu = new int[5][5];
		public static int[] e = new int[5];
		public static int[][] after = new int[5][5];
		public static int m;
		public static int n;
		public static int row;
		public static int col;
		public static int i;
	public static void Main(String[] args)
	{
		int exchange = new int(int a,int b);
		for (row = 0;row < 5;row++)
		{
			for (col = 0;col < 5;col++)
			{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			shuzu[row][col] = Integer.parseInt(tempVar);
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
		if (exchange(m, n) == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (row = 0;row < 5;row++)
			{
		for (col = 0;col < 5;col++)
		{
			if (col != 4)
			{
				System.out.printf("%d ",after[row][col]);
			}
		else
		{
			System.out.printf("%d\n",after[row][col]);
		}
		}
			}
		}


	}
	public static int exchange(int a, int b)
	{
		if (a >= 0 && a < 5 && b >= 0 && b < 5)
		{
			for (i = 0;i < 5;i++)
			{
		e[i] = shuzu[m][i];
		shuzu[m][i] = shuzu[n][i];
		shuzu[n][i] = e[i];
			}
		for (row = 0;row < 5;row++)
		{
		for (col = 0;col < 5;col++)
		{
			after[row][col] = shuzu[row][col];
		}
		}
		return 1;
		}

		else
		{
			return 0;
		}
	}
}

