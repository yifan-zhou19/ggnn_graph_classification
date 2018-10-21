package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int a;
		 int b;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(",");
		 if (tempVar2 != null)
		 {
			 b = Integer.parseInt(tempVar2);
		 }
		int i;
		int j;
		int[][] x = new int[5][5];
		int maxi;
		int locali;
		int minj;
		int localj;
		int[] max = new int[5];
		int[] min = new int[5];
		int[] col = new int[5];
		int[] row = new int[5];
		for (i = 0; i <= a - 1; i++)
		{
			for (j = 0; j <= b - 1; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0; i <= a - 1; i++)
		{
			for (j = 0, maxi = x[i][j], locali = j ; j <= b - 2; j++) //???i??j?
			{
				if (maxi <= x[i][j + 1])
				{
					maxi = x[i][j + 1];
					locali = j + 1; //locali????????
				}
			}
			max[i] = maxi;
			col[i] = locali; //col i???i??????????
		}
		for (j = 0, i = 0; j <= b - 1; j++)
		{

			for (i = 0, minj = x[i][j], localj = i ; i <= a - 2; i++) //???j??i?
			{
				if (minj >= x[i + 1][j])
				{
					minj = x[i + 1][j];
					localj = i + 1; //localj????????
				}
			}
			min[j] = minj;
			row[j] = localj; //row j???j????????
		}
		for (i = 0, j = 0; i <= a - 1; i++) //???j????????
		{
			if (row[col[i]] == i)
			{
				System.out.printf("%d+%d",i,col[i]);
				j++;
			}
		}
		if (j == 0)
		{
			System.out.print("No\n");
		}
	}

}

