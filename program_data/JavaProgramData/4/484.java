package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		int[][] array = new int[100][100];
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int p = 0;
		int q = 0;
		   while (p < row && q < col)
		   {
			 int e = 0;
			 while (p + e < row && q - e >= 0)
			 {
				  System.out.printf("%d\n",array[p + e][q - e]);
				  e++;
			 }
			 if (q < col - 1)
			 {
				q++;
			 }
			 else if (q == col - 1)
			 {
				 p++;
			 }
		   }
		return 0;
	}
}

