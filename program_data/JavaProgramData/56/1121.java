package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int m;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n / 10000 > 0 && n / 10000 < 10)
	  {
		  m = n / 10000 + n / 1000 % 10 * 10 + n / 100 % 10 * 100 + n / 10 % 10 * 1000 + n % 10 * 10000;
	  System.out.printf("%d",m);
	  }
	  if (n / 1000 > 0 && n / 1000 < 10)
	  {
		  m = n / 1000 + m / 100 % 10 * 10 + m / 10 * 100 + m % 10 * 1000;
	   System.out.printf("%d",m);
	  }
	  if (n / 100 > 0 && n / 100 < 10)
	  {
		   m = n / 100 + n / 10 % 10 * 10 + n % 10 * 100;
		System.out.printf("%d",m);
	  }
	   if (n / 10 < 10 && n / 10>0)
	   {
			m = n / 10 + n % 10 * 10;
	   System.out.printf("%d",m);
	   }
	return 0;
	}
}

