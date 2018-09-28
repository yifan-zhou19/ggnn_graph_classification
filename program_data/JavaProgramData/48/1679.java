package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int n;
	   int k;
	   int i;
	   int j;
	   int t;
	   int g;
	   int f;
	   int[][] a = new int[9][9];
	   int[][] b = new int[9][9];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   a[4][4] = n;
	   b[4][4] = n;
	   for (k = 0;k < m;k++)
	   {
		 for (i = 4 - k;i <= 4 + k;i++)
		 {
		   for (j = 4 - k;j <= 4 + k;j++)
		   {
			for (t = i - 1;t <= i + 1;t++)
			{
			  for (g = j - 1;g <= j + 1;g++)
			  {
				a[t][g] += b[i][j];
			  }
			}
		   }
		 }
		 for (i = 0;i < 9;i++)
		 {
		   for (j = 0;j < 9;j++)
		   {
			 b[i][j] = a[i][j];
		   }
		 }
	   }
	   for (i = 0;i < 9;i++)
	   {
		 for (j = 0;j < 9;j++)
		 {
			if (j != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%d",a[i][j]);
		 }
		 System.out.print("\n");
	   }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	}


}

