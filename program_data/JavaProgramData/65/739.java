package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   double jieguo = 0.00;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[] a = new int[n];
	   int[] b = new int[n];
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   b[i] = Integer.parseInt(tempVar3);
		   }
		   if (a[i] == b[i] - 1 || a[i] == b[i] + 2)
		   {
			   jieguo = jieguo + 1;
		   }
			  else if (a[i] == b[i])
			  {
				  jieguo = jieguo;
			  }
				 else
				 {
					 jieguo = jieguo - 1;
				 }
	   }
	   if (jieguo == 0.00)
	   {
		   System.out.print("Tie");
	   }
	   else if (jieguo > 0.00)
	   {
		   System.out.print("A");
	   }
	   else
	   {
		   System.out.print("B");
	   }
	   return 0;
	}
}

