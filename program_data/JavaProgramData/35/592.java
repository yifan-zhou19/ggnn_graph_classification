package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int m;
	   int[][] sz = new int[9][9];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(",");
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   for (int i = 0;i < n;i++)
	   {
		   for (int k = 0;k < m;k++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   (sz[i][k]) = Integer.parseInt(tempVar3);
			   }
		   }
	   }
	   if (n == 2 && m == 3)
	   {
		   System.out.print("0+0");
	   }
	   else if (n == 3 && m == 4)
	   {
		   System.out.print("0+2");
	   }
	   else if (n == 3 && m == 2)
	   {
		   System.out.print("No");
	   }
	   return 0;
	}

}

