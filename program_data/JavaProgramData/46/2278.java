package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int i;
	  int j;
	  int x;
	  int y;
	  int z;
	   int[][] a = new int[100][100];
	   int[][] b = new int[100][100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   x = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   y = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < x;i++)
	   {
		   for (j = 0;j < y;j++)
		   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i][j] = Integer.parseInt(tempVar3);
		   }
		   }
	   }
		 while (x > 0)
		 {
		 for (j = 0;j < y;j++)
		 {
		System.out.printf("%d\n",a[0][j]);
		 }
	   for (i = 0;i < y;i++)
	   {
				for (j = 0;j < x;j++)
				{
				 b[i][j] = a[j + 1][y - 1 - i];
				}
	   }
		for (i = 0;i < y;i++)
		{
				for (j = 0;j < x;j++)
				{
				 a[i][j] = b[i][j];
				}
		}
		z = x;
		x = y;
		y = z - 1;
		 }
	}

}

