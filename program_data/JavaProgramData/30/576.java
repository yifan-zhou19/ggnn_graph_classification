package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int sum = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   while (n > 0)
	   {
		   if (n % 7 == 0 || n % 10 == 7 || n / 10 == 7)
		   {
			 sum = sum;
		   }
		  else if (n % 7 != 0 && n % 10 != 7 && n / 10 != 7)
		  {
			 sum = sum + n * n;
		  }
			 n = n - 1;

	   }
	   System.out.printf("%d",sum);
	   return 0;
	}
}

