package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   if (n <= 9)
	   {
	   System.out.printf("%d",n);
	   }
	   else
	   {
		   if (n <= 99)
		   {
			  a = n % 10;
			  b = n / 10;
			  System.out.printf("%d%d",a,b);
		   }
		  else
		  {
			  if (n <= 999)
			  {
				 a = n % 10;
				 c = n / 100;
				 b = (n % 100) / 10;
				 System.out.printf("%d%d%d",a,b,c);
			  }
			 else
			 {
				 if (n <= 9999)
				 {
				   a = n % 10;
				   b = (n % 100) / 10;
				   c = (n % 1000) / 100;
				   d = n / 1000;
				   System.out.printf("%d%d%d%d",a,b,c,d);
				 }
			   else
			   {
			   System.out.print("00001");
			   }

			 }

		  }

	   }

	return 0;


	}

}

