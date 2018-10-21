package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[1000][2];
	   int i;
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i][0] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   a[i][1] = Integer.parseInt(tempVar3);
		   }
	   }
	   float c = 100 * (float)a[0][1] / (float)a[0][0];
	   for (i = 1;i < n;i++)
	   {
		   float b;
		   b = 100 * (float)a[i][1] / (float)a[i][0];
		   if (b - c > 5F)
		   {
			   System.out.print("better\n");
		   }
		   else if (c - b > 5F)
		   {
			   System.out.print("worse\n");
		   }
				else
				{
					System.out.print("same\n");
				}
	   }
	   return 0;
	}
}

