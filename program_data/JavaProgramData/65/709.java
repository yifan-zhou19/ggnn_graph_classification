package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int x = 0;
	   int y = 0;
	   int[] a = new int[200];
	   int[] b = new int[200];
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
			   (a[i]) = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   (b[i]) = Integer.parseInt(tempVar3);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		 if (a[i] == 0 && b[i] == 1)
		 {
			 x = x + 1;
		 }
		 else if (a[i] == 1 && b[i] == 2)
		 {
					  x = x + 1;
		 }
				  else if (a[i] == 2 && b[i] == 0)
				  {
							x = x + 1;
				  }
		 if (a[i] == 1 && b[i] == 0)
		 {
			 y = y + 1;
		 }
		 else if (a[i] == 2 && b[i] == 1)
		 {
				  y = y + 1;
		 }
			   else if (a[i] == 0 && b[i] == 2)
			   {
						y = y + 1;
			   }
	   }
	   if (x > y)
	   {
		   System.out.print("A");
	   }
	   if (x < y)
	   {
		   System.out.print("B");
	   }
	   if (x == y)
	   {
		   System.out.print("Tie");
	   }
	   return 0;

	}


}

