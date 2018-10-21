package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] A = new int[100][100];
		int[][] B = new int[100][100];
		int[][] c = new int[100][100];
		int i;
		int x;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= x1 - 1;i++)
		{
			for (k = 0;k <= y1 - 1;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(A[i][k]) = Integer.parseInt(tempVar3);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		for (i = 0;i <= x2 - 1;i++)
		{
			for (k = 0;k <= y2 - 1;k++)
			{
			  String tempVar6 = ConsoleInput.scanfRead();
			  if (tempVar6 != null)
			  {
				  B[i][k] = Integer.parseInt(tempVar6);
			  }
			}
		}
		int result = 0;
		for (i = 0;i <= x1 - 1;i++)
		{
			if (i != 0)
			{
			System.out.print("\n");
			}
			for (k = 0;k <= y2 - 1;k++)
			{
			   for (x = 0;x <= y1 - 1;x++)
			   {
			   result = result + A[i][x] * B[x][k];
			   }
			   if (k == 0)
			   {
			   System.out.printf("%d",result);
			   }
			   if (k != 0)
			   {
			   System.out.printf(" %d",result);
			   }
			   result = 0;
			}
		}
	}
}

