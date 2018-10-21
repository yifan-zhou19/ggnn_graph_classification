package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int[][] a = new int[8][8];
		int[] b = new int[8];
		int max;
		int row;
		int col;
		int result = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			max = 0;
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				if (a[i][j] > a[i][max])
				{
					max = j;
				}
			}
			b[i] = max;
		}
		for (i = 0;i < row;i++)
		{
			for (k = 0;k < row;k++)
			{
				if (a[k][b[i]] < a[i][b[i]])
				{
					result = 0;
				}
			}
			if (result != 0)
			{
				System.out.printf("%d+%d",i,b[i]);
				break;
			}
			else
			{
				System.out.print("No");
				break;
			}
		}
	}


}

