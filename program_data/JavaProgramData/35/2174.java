package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[8][8];
		int i = 0;
		int j = 0;
		int k = 0;
		int c = 0;
		int d = 0;
		int max = 0;
		int locate = 0;
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
		for (i = 0;i <= row - 1;i++)
		{
		 for (j = 0;j <= col - 1;j++)
		 {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar3);
		  }
		 }
		}
		for (i = 0;i <= row - 1;i++)
		{
		 for (j = 0;j <= col - 1;j++)
		 {
		  if (max < a[i][j])
		  {
		   max = a[i][j];
		   locate = i * 10 + j;
		  }
		 }
		 for (k = 0;k <= row - 1;k++)
		 {
		  if (a[k][locate % 10] >= max)
		  {
		   c += 1;
		  }
		 }
		 if (c == row)
		 {
		  System.out.printf("%d+%d",locate / 10,locate % 10);
		 }
		 else
		 {
		  d += 1;
		 }
		 max = 0;
		 c = 0;
		}
		if (d == row)
		{
		 System.out.print("No");
		}
	}

}

