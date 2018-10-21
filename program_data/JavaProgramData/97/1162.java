package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
	   int n;
	   int x;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   x = n / 100;
	   System.out.printf("%d\n",x);
	   n = n - x * 100;
	   x = n / 50;
	  System.out.printf("%d\n",x);
	  n = n - x * 50;
	  x = n / 20;
	  System.out.printf("%d\n",x);
	  n = n - x * 20;
	  x = n / 10;
	  System.out.printf("%d\n",x);
	n = n - x * 10;
	  x = n / 5;
	  System.out.printf("%d\n",x);
	n = n - x * 5;
	  x = n;
	  System.out.printf("%d",x);
	  return 0;
	  }



}

