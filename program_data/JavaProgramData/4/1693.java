package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int col;
		int row;
		int[][] array = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
		   for (j = 0;j < col;j++)
		   {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  array[i][j] = Integer.parseInt(tempVar3);
			  }
		   }
		}
		int cxx = 0;
		int csx;
		int rxx = 0;
		int rsx;
		for (i = 0;i < col;i++)
		{
		   csx = i;
		   rxx = 0;
		   while (csx >= 0 && csx < col && rxx >= 0 && rxx < row)
		   {
		   System.out.printf("%d\n",array[rxx][csx]);
		   csx--;
		   rxx++;
		   }
		}
		for (j = 1;j < row;j++)
		{
		   rxx = j;
		   csx = col - 1;
		   while (csx >= 0 && csx < col && rxx >= 0 && rxx < row)
		   {
		   System.out.printf("%d\n",array[rxx][csx]);
		   csx--;
		   rxx++;
		   }
		}
		int t;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			t = Integer.parseInt(tempVar4);
		}
		return 0;
	}
}

