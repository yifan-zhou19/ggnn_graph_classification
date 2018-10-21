package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int[] a = new int[1000];
	   int[] b = new int[1000];
	   double x;
	   double y;
	   double z;
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
			a[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	   }
	   x = (double)b[0] / a[0];
	   for (i = 1;i < n;i++)
	   {
		 y = (double)b[i] / a[i];
		 z = y - x;
		 if (z > 0.05)
		 {
			 System.out.print("better\n");
		 }
		 else if (z < -0.05)
		 {
			 System.out.print("worse\n");
		 }
		 else
		 {
			 System.out.print("same\n");
		 }
		 z = 0;
	   }
		return 0;
	}
}

