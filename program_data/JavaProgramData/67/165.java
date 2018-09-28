package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int[] m = new int[1000];
	   int i;
	   int[] x = new int[1000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[][] ss = new int[1000][2];
		  for (i = 0;i < n;i++)
		  {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   ss[i][0] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   ss[i][1] = Integer.parseInt(tempVar3);
		   }
		  }

		   for (i = 0;i < n;i++)
		   {
		   x[i] = (int)(100.0 * ss[i][1] / ss[i][0] + 0.5);
		   }
		   for (i = 1;i < n;i++)
		   {
		   if (x[i] - x[0] > 5)
		   {
			   System.out.print("better\n");
		   }
		   else if (x[0] - x[i] > 5)
		   {
			   System.out.print("worse\n");
		   }
		   else if (x[i] - x[0] < 5 && x[0] - x[i] < 5)
		   {
			   System.out.print("same\n");
		   }
		   }



		 return 0;
	}
}

