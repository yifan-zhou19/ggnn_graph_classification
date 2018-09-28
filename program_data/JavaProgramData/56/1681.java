package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int b;
	   int c;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   b = (n - n % 10000) / 10000 + (n % 10000 - n % 1000) / 100 + (n % 1000 - n % 100) + (n % 100 - n % 10) * 100 + (n % 10) * 10000;
	   if (b % 10 == 0)
	   {

		  b = b / 10;
	   }
	   else
	   {
		   b = b;
	   }
		if (b % 10 == 0)
		{

		  b = b / 10;
		}
	   else
	   {
		   b = b;
	   }
		if (b % 10 == 0)
		{

		  b = b / 10;
		}
		 else
		 {
			 b = b;
		 }
	System.out.printf("%d",b);



	}



}

