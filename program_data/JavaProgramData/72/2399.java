package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   int[][] key = new int[20][20];
	   int[][] height = new int[22][22];
	   for (int i = 0;i < m;i++)
	   {
		  for (int j = 0;j < n;j++)
		  {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				height[i + 1][j + 1] = Integer.parseInt(tempVar3);
			}
		  }
	   }
	   for (int i = 0;i < m;i++)
	   {
		 for (int j = 0;j < n;j++)
		 {
			 if (height[i + 1][j + 1] >= height[i][j + 1] != 0 && height[i + 1][j + 1] >= height[i + 2][j + 1] != 0 && height[i + 1][j + 1] >= height[i + 1][j] != 0 && height[i + 1][j + 1] >= height[i + 1][j + 2])
			 {
			   key[i][j] = 1;
			 }
		 }
	   }
	   for (int i = 0;i < m;i++)
	   {
		 for (int j = 0;j < n;j++)
		 {
		   if (key[i][j] == 1)
		   {
			 System.out.printf("%d %d\n",i,j);
		   }
		 }
	   }
	   System.in.read();
	   System.in.read();
	}

}

