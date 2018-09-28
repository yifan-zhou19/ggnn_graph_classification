package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   if (n >= 100)
	   {
	   System.out.printf("%d\n",n / 100);
	   n = n - 100 * (n / 100);
	   }
	   else
	   {
		   System.out.print("0\n");
	   }
		  if (n >= 50)
		  {
	   System.out.printf("%d\n",n / 50);
	   n = n - 50 * (n / 50);
		  }
	   else
	   {
		   System.out.print("0\n");
	   }
		  if (n >= 20)
		  {
	   System.out.printf("%d\n",n / 20);
	   n = n - 20 * (n / 20);
		  }
	   else
	   {
		   System.out.print("0\n");
	   }
		  if (n >= 10)
		  {
	   System.out.printf("%d\n",n / 10);
	   n = n - 10 * (n / 10);
		  }
	   else
	   {
		   System.out.print("0\n");
	   }
		  if (n >= 5)
		  {
	   System.out.printf("%d\n",n / 5);
	   n = n - 5 * (n / 5);
		  }
	   else
	   {
		   System.out.print("0\n");
	   }
		  if (n >= 1)
		  {
	   System.out.printf("%d\n",n);
	   n = n - 1 * (n / 1);
		  }
	   else
	   {
		   System.out.print("0\n");
	   }
	   return 0;
	}

}

