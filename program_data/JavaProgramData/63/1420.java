package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;
		int i;
		int j;
		int q;
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
		for (i = 0;i < x1;i++)
		{
				for (j = 0;j < y1;j++)
				{
					 String tempVar3 = ConsoleInput.scanfRead();
					 if (tempVar3 != null)
					 {
						 a[i][j] = Integer.parseInt(tempVar3);
					 }
				 if (j < (y1 - 1))
				 {
					scanf(" ");
				 }
				}
		}
		i = 0;
		j = 0;
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
		for (i = 0;i < x2;i++)
		{
				for (j = 0;j < y2;j++)
				{
					 String tempVar6 = ConsoleInput.scanfRead();
					 if (tempVar6 != null)
					 {
						 b[i][j] = Integer.parseInt(tempVar6);
					 }
				 if (j < (y2 - 1))
				 {
					scanf(" ");
				 }
				}
		}
		x3 = x1;
		y3 = y2;
		i = 0;
		j = 0;
		q = 0;
		for (i = 0;i < x3;i++)
		{
				for (j = 0;j < y3;j++)
				{
					 c[i][j] = 0;
				 for (q = 0;q < y1;q++)
				 {
					  c[i][j] = c[i][j] + a[i][q] * b[q][j];
				 }
					  q = 0;
				}
		}
		i = 0;
		j = 0;
		for (i = 0;i < x3;i++)
		{
				for (j = 0;j < y3;j++)
				{
					 System.out.printf("%d",c[i][j]);
				 if (j < (y3 - 1))
				 {
					System.out.print(" ");
				 }
				 else
				 {
					 System.out.print("\n");
				 }
				}
		}
	}
}

