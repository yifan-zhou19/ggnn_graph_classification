package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int[][] a = new int[200][2];
	   double c;
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
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i][1] = Integer.parseInt(tempVar3);
	   }
	   }
		c = (double)a[0][1] / a[0][0];
	   for (i = 1;i < n;i++)
	   {
	   if ((double)a[i][1] / a[i][0] - c > 0.05)
	   {
		System.out.print("better\n");
	   }
	   else if ((double)a[i][1] / a[i][0] - c < -0.05)
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

