package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int a = 0;
	   int b = 0;
	   int c = 0;
	   int d = 0;
	   int e = 0;
	   int f = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   if (n / 100 != 0)
	   {
		 a = n / 100;
		 n = n - 100 * a;
		 if (n / 50 != 0)
		 {
		  b = n / 50;
		  n = n - b * 50;
		 }
		if (n / 20 != 0)
		{
		   c = n / 20;
		   n = n - c * 20;
		}
		if (n / 10 != 0)
		{
		   d = n / 10;
		   n = n - d * 10;
		}
		if (n / 5 != 0)
		{
		   f = n / 5;
		   n = n - f * 5;
		}
	   if (n / 1 != 0)
	   {
		   e = n / 1;
		   n = n - e * 1;
	   }
	   }
	  else
	  {
		  if (n / 50 != 0)
		  {
		  b = n / 50;
		  n = n - b * 50;
		  }
		if (n / 20 != 0)
		{
		   c = n / 20;
		   n = n - c * 20;
		}
		if (n / 10 != 0)
		{
		   d = n / 10;
		   n = n - d * 10;
		}
	   if (n / 5 != 0)
	   {
		   f = n / 5;
		   n = n - f * 5;
	   }
	   if (n / 1 != 0)
	   {
		   e = n / 1;
		   n = n - e * 1;
	   }
	  }
	  System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,f,e);
	  return 0;
	}




}

