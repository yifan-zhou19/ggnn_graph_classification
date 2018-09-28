package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int[] b = new int[3];
		int[] c = new int[3];
		int i;
		int n = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 if (a % 3 == 0 || a % 5 == 0 || a % 7 == 0)
	 {
		 if (a % 3 == 0)
		 {
			 b[0] = 3;
		 }
	   else
	   {
		   b[0] = 0;
	   }
	   if (a % 5 == 0)
	   {
		   b[1] = 5;
	   }
	   else
	   {
		   b[1] = 0;
	   }
	   if (a % 7 == 0)
	   {
		   b[2] = 7;
	   }
	   else
	   {
		   b[2] = 0;
	   }

	   for (i = 0;i < 3;i++)
	   {
		   if (b[i] != 0)
		   {
			   c[n] = b[i];
		   n++;
		   }
	   }
	   for (i = 0;i < n - 1;i++)
	   {
		   System.out.printf("%d ",c[i]);
	   }
	   System.out.printf("%d\n",c[n - 1]);

	 }
	  else
	  {
		  System.out.print("n\n");
	  }
	}
}

