package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int yibai = 0;
	   int wushi = 0;
	   int ershi = 0;
	   int yishi = 0;
	   int wu = 0;
	   int yi = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int a;
	   int b;
		  a = n % 10;
		  b = (n / 10) % 10;

		  if (a < 5)
		  {
		  yi = a;
		  wu = 0;
		  }
		  else
		  {
		   yi = a - 5;
		   wu = 1;
		  }

		  if (b < 5)
		  {
		   ershi = b / 2;
		   yishi = b % 2;
		   wushi = 0;
		  }
		   else
		   {
		   wushi = 1;
		   ershi = (b - 5) / 2;
		   yishi = (b - 5) % 2;
		   }
	   yibai = n / 100;
	   System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",yibai,wushi,ershi,yishi,wu,yi);
		 return 0;
	}
}

